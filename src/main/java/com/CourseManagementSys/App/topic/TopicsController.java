package com.CourseManagementSys.App.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> topicsList(){
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")

    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
}
