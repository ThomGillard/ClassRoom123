package Template.repository;

import Template.models.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ClassRoom,Long> {
}
