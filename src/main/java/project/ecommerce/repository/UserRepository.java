package project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ecommerce.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
