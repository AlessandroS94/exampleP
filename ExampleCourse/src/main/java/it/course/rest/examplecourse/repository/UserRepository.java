package it.course.rest.examplecourse.repository;

import it.course.rest.examplecourse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}