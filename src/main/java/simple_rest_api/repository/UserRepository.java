package simple_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simple_rest_api.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
