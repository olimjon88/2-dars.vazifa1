package uz.pdp.vazifa1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.vazifa1.entity.Attachment;

public interface AttachmentRepo extends JpaRepository<Attachment, Long> {
}
