package it.course.rest.examplecourse.controller;

import it.course.rest.examplecourse.model.Course;
import it.course.rest.examplecourse.repository.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CourseController {
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping("/course")
    public ResponseEntity<Course> getCourse(@RequestBody Course course){
        Course _course = courseRepository.save(course);
        return new ResponseEntity<Course>(_course, HttpStatus.CREATED);
    }
    
    @GetMapping("/course/{id}")
    public ResponseEntity<Optional> getCourse(@PathVariable("id") Long id){
        Optional<Course> _course = courseRepository.findById(id);
        return new ResponseEntity<Optional>(_course,HttpStatus.OK);
    }

    @GetMapping("/course")
    public ResponseEntity<ArrayList<Course>> getAllCourse(){
        ArrayList<Course> _course = (ArrayList<Course>) courseRepository.findAll();
        return new ResponseEntity<>(_course,HttpStatus.OK);
    }
}
