package com.CourseManagementSys.App.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<Topics> topicsList(){
        return List.of(
                new Topics("1","Strings","sequence of characters"),
                new Topics("2","Arrays","can store multiple values"),
                new Topics("3","Dictionaries"," a general-purpose data structure for storing a group of objects")
        );
    }
}
