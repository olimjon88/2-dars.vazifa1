package uz.pdp.vazifa1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.vazifa1.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepo extends JpaRepository<AttachmentContent, Long> {
    Optional<AttachmentContent> findByAttachmentId(Long attachmentLong);
}
