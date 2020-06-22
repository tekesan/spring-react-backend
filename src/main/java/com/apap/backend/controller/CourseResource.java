package com.apap.backend.controller;

import com.apap.backend.model.Course;
import com.apap.backend.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseResource {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{name}")
    public List<Course> getAllCourse(@PathVariable String name){
        return courseService.findAll();
    }
}
