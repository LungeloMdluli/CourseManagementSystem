package com.CourseManagementSys.App.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topics = Arrays.asList(
            new Topics("1", "Strings", "sequence of characters"),
            new Topics("2", "Arrays", "can store multiple values"),
            new Topics("3", "Dictionaries", " a general-purpose data structure for storing a group of objects")
    );

    public List<Topics> getTopics(){
        return topics;
    }
}
