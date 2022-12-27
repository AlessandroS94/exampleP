package it.course.rest.examplecourse.repository;

import it.course.rest.examplecourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}