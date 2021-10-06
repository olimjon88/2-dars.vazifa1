package uz.pdp.vazifa1.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import uz.pdp.vazifa1.entity.Attachment;
import uz.pdp.vazifa1.entity.AttachmentContent;
import uz.pdp.vazifa1.repo.AttachmentContentRepo;
import uz.pdp.vazifa1.repo.AttachmentRepo;
import uz.pdp.vazifa1.result.Result;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
@RequestMapping(value="api/attachment")
public class AttachmentController {
    @Autowired
    AttachmentRepo attachmentRepo;

    @Autowired
    AttachmentContentRepo attachmentContentRepo;

    @GetMapping("/info/{id}")
    public ResponseEntity<Attachment> getInfo(@PathVariable Long id){
        Optional<Attachment> optionalAttachment = attachmentRepo.findById(id);
        return optionalAttachment.map(attachment -> new ResponseEntity<>(attachment, HttpStatus.OK)).orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @SneakyThrows
    @GetMapping("/download/{id}")
    public ResponseEntity<Result> download(@PathVariable Long id, HttpServletResponse response){
        Optional<Attachment> optionalAttachment = attachmentRepo.findById(id);
        if(!optionalAttachment.isPresent())
            return new ResponseEntity<>(new Result("This file is not exist", false), HttpStatus.NOT_FOUND);

        Attachment attachment = optionalAttachment.get();
        Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepo.findByAttachmentId(attachment.getId());

        if (!optionalAttachmentContent.isPresent())
            return new ResponseEntity<>(new Result("File not found", false), HttpStatus.NOT_FOUND);

        response.setHeader("Content-Disposition", "attachment; filename = \"" + attachment.getName() + "\"");
        response.setContentType(attachment.getContentType());

        FileCopyUtils.copy(optionalAttachmentContent.get().getBytes(), response.getOutputStream());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @SneakyThrows
    public Attachment add(MultipartFile file) {
        if (file == null)
            return null;
        String originalFilename = file.getOriginalFilename();
        String contentType = file.getContentType();
        long size = file.getSize();


        Attachment attachment = attachmentRepo.save(Attachment.builder().contentType(contentType).name(originalFilename).size(size).build());

        attachmentContentRepo.save(AttachmentContent.builder().attachment(attachment).bytes(file.getBytes()).build());
        return attachment;
    }
}
