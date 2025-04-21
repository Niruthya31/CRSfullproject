package com.Crsproject.Course.Registration.System.controller;


import com.Crsproject.Course.Registration.System.model.Course;
import com.Crsproject.Course.Registration.System.model.CourseRegistry;
import com.Crsproject.Course.Registration.System.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})

public class Coursecontroller {

      @Autowired
    Courseservice courseservice;

      @GetMapping("/courses")
      public List<Course> availableCourses(){
          return  courseservice.availableCourses();
      }
       @GetMapping("/courses/enrolled")
       public  List<CourseRegistry> enrolledStudents(){
          return courseservice.enrolledStudents();
       }
       @PostMapping("/courses/register")
       public String enrollCourse(@RequestParam("name") String name,
                                  @RequestParam("emailId") String emailId,
                                  @RequestParam("courseName") String courseName){
          courseservice.enrollCourse(name,emailId,courseName);
          return " congratulation! " +name+" Enrollment Successful for "+ courseName +" Course ";
       }

    }


