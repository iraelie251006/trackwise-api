package tech.iraelie.trackwise_api.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, String> {
}
