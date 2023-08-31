//package com.CourseManagementSys.App.course;
//
//import com.CourseManagementSys.App.topic.Topic;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class CourseService {
//    @Autowired
//    private CourseRepository courseRepository;
//
//    public List<Course> getCourses(String topicId) {
//        List<Course> courses = new ArrayList<>();
//        courseRepository.findByTopicId(topicId).forEach(courses::add);
//        return courses;
//    }
//
//    public Optional<Course> getCourse(String id) {
//
//        return courseRepository.findById(id);
//    }
//
//    //This function handles the post request for adding topics.
//    public void addCourse(Course course, String topicId) {
//        courseRepository.save(course);
//
//    }
//
//    public void changeCourse(Course course, String id) {
//
//        courseRepository.save(course);
//
//
//    }
//
//    public void removeCourse(String id) {
//
//        courseRepository.deleteById(id);
//
//    }
//}