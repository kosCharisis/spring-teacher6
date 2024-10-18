package gr.aueb.cf.springteacherapp.repository;

import gr.aueb.cf.springteacherapp.core.enums.Role;
import gr.aueb.cf.springteacherapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByRole(Role role);
}
