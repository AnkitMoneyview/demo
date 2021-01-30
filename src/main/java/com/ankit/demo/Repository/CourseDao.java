package com.ankit.demo.Repository;

import com.ankit.demo.Service.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, String> {
    //adfay
}
