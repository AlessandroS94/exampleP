package it.course.rest.examplecourse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @Getter
    @Setter
    @Transient
    private List<User> userList = new java.util.ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public Role(List<User> userList) {
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}