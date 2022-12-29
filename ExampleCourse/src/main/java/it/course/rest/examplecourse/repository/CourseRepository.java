package it.course.rest.examplecourse.repository;

import it.course.rest.examplecourse.model.Course;
import it.course.rest.examplecourse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
}