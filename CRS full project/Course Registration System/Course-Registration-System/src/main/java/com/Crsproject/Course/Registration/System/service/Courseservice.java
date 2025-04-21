package com.Crsproject.Course.Registration.System.service;


import com.Crsproject.Course.Registration.System.model.Course;
import com.Crsproject.Course.Registration.System.model.CourseRegistry;
import com.Crsproject.Course.Registration.System.repository.Courserepo;
import com.Crsproject.Course.Registration.System.repository.Courseresistryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {

    @Autowired
    Courserepo courserepo;

    @Autowired
    Courseresistryrepo courseresistryrepo;

    public List<Course> availableCourses() {
       return courserepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseresistryrepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry= new CourseRegistry(name,emailId,courseName);
        courseresistryrepo.save(courseRegistry);
    }

}
