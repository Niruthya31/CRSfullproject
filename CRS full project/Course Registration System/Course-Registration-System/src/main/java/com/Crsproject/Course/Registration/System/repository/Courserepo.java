package com.Crsproject.Course.Registration.System.repository;

import com.Crsproject.Course.Registration.System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Courserepo extends JpaRepository<Course,String> {


}
