package com.CourseManagementSys.App.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Strings", "sequence of characters"),
            new Topic("2", "Arrays", "can store multiple values"),
            new Topic("3", "Dictionaries", " a general-purpose data structure for storing a group of objects")
    );

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        for (Topic topic : topics){
            if (topic.getId().equals(id)){
                return topic;
            }

        }
            return null;
    }
}
