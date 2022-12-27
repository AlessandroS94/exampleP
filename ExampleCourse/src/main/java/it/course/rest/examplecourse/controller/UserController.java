package it.course.rest.examplecourse.controller;

import it.course.rest.examplecourse.model.User;
import it.course.rest.examplecourse.repository.RoleRepository;
import it.course.rest.examplecourse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User _user = userRepository.getReferenceById(id);
        return new ResponseEntity<User>(_user,HttpStatus.OK);
    }
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        //return new ResponseEntity<>(user,HttpStatus.OK);
        User _user = userRepository.save(user);
        return new ResponseEntity<>(_user, HttpStatus.CREATED);
    }

}
