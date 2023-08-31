package com.CourseManagementSys.App.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> topicsList(){
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")

    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void PostTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void UpdateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.changeTopic(topic,id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.removeTopic(id);
    }
}
