package com.CourseManagementSys.App.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    /* Since I do not have a database to store the data,
     this is where I hardcoded the data topics data that I am using.
     */
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic("1", "Strings", "sequence of characters"),
            new Topic("2", "Arrays", "can store multiple values"),
            new Topic("3", "Dictionaries", " a general-purpose data structure for storing a group of objects")
    ));

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

    //This function handles the post request for adding topics.
    public void addTopic(Topic topic) {
        topics.add(topic);

    }

    public void changeTopic(Topic topic,String id) {
        for (int i = 0 ; i < topics.size(); i++){
            if (topic.getId().equals(id)){
                topics.set(i,topic);
            }
        }

    }

    public void removeTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.remove(topics.get(i));
                }
            }
        }
}
