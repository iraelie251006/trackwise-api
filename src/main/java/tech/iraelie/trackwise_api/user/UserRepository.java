package tech.iraelie.trackwise_api.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    this inherited methods from basic CRUD
//    INHERITS ListPagingAndSortingRepository
//
}

