package it.course.rest.examplecourse.repository;

import it.course.rest.examplecourse.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}