package com.Crsproject.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseRegistry {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)  //Autimatically generate the value
         private int id;
       private String name;
       private String emailId;
       private String courseName;

    public CourseRegistry(String name, String emailId, String courseName) {
        this.name=name;
        this.emailId=emailId;
        this.courseName=courseName;
    }
    public CourseRegistry(){

    }
}
