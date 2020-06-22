package com.apap.backend.services;

import com.apap.backend.model.Course;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private static List<Course> courses = new ArrayList<>();
    private static long id = 0;

    static {
        courses.add(new Course(++id, "APAP", "Learn Spring Boot"));
        courses.add(new Course(++id, "APAP", "Learn React"));
        courses.add(new Course(++id, "APAP", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(++id, "APAP", "Deploy to Heroku"));
    }

    public List<Course> findAll(){
        return courses;
    }
}
