//package com.CourseManagementSys.App.course;
//
//import com.CourseManagementSys.App.topic.Topic;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.Optional;
//
//public class CourseController {
//
//    @Autowired
//    private CourseService courseService;
//
//    @RequestMapping("/topics/{id}/courses")
//    public Optional<Course> courseList(@PathVariable String topicId){
//        return courseService.getCourse(topicId);
//    }
//
//    @RequestMapping("/topic/{topicId}/courses")
//    public Optional<Course> getCourse(@PathVariable String id){
//        return courseService.getCourse(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/course")
//    public void PostCourse(@RequestBody Course course, @PathVariable String topicId){
//        course.setTopic(new Topic(topicId,"",""));
//        courseService.addCourse(course, topicId);
//
//    }
//    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}/courses/{id}")
//    public void UpdateTopic(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id){
//        course.setTopic(new Topic(topicId, "", ""));
//        courseService.changeCourse(course,id);
//
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/courses/{id}")
//    public void deleteTopic(@PathVariable String id){
//        courseService.removeCourse(id);
//    }
//
//}
