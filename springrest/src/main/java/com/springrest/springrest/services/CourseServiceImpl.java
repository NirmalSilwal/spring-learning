package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        this.list =  new ArrayList<>();
        list.add(new Course(1, "EA","course covering Spring and Hibernate"));
        list.add(new Course(2, "WAA", "course covering SpringBoot and React"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        for (Course course : list) {
            if (course.getId() == courseId)
                return course;
        }
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
