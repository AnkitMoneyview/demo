package com.ankit.demo.controller;

import com.ankit.demo.Service.Course;
import com.ankit.demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/")
    public String home(){
        return "this is home page";
    }

    @RequestMapping("/save")
    public void saveCourse(){
        courseService.addCourse();
    }

    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @RequestMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return courseService.getCourse(courseId);
    }

}
