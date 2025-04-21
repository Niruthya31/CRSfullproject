package com.Crsproject.Course.Registration.System.repository;

import com.Crsproject.Course.Registration.System.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courseresistryrepo extends JpaRepository<CourseRegistry,Integer> {

}
