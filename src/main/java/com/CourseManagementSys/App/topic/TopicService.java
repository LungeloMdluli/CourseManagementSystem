package com.CourseManagementSys.App.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {


    @Autowired
    private TopicRepository repository;

    /* Since I do not have a database to store the data,
     this is where I hardcoded the data topics data that I am using.
     */

    public List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
        repository.findAll().forEach(topics :: add);
        return topics;
    }

    public Optional<Topic> getTopic(String id){

        return repository.findById(id);
    }

    //This function handles the post request for adding topics.
    public void addTopic(Topic topic) {
        repository.save(topic);

    }

    public void changeTopic(Topic topic,String id) {

        repository.save(topic);


    }

    public void removeTopic(String id) {

        repository.deleteById(id);

    }
}
