package com.ankit.demo.Service;

import com.ankit.demo.Repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> list1;

    public CourseService() {
        this.list1 = new ArrayList<>();
        list1.add(new Course("123", "Mathematics", 100));
        list1.add(new Course("456", "Physics", 100));
        list1.add(new Course("789", "ComputerScience", 100));
    }

    @Autowired
    private CourseDao courseDao;

    public void addCourse(){
        courseDao.saveAll(this.list1);
    }

    public List<Course> getCourses(){
        return (List<Course>) courseDao.findAll();
    }

    public Course getCourse(String courseId){
        List<Course> list2 = (List<Course>) courseDao.findAll();
        Course c1 = new Course();

        for(Course c : list2){
            if (c.getCourseId().equals(courseId)){
                c1.setCourseId(c.getCourseId());
                c1.setCourseName(c.getCourseName());
                c1.setNoOfStudent(c.getNoOfStudent());
                break;
            }
        }
        return c1;
    }

}
