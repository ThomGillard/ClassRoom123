package Template.repository;

import Template.models.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository2 extends JpaRepository<user,Long> {
}
