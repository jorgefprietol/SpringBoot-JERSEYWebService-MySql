package com.infotech.jersey.service;

import java.util.List;

import com.infotech.jersey.entities.Topic;

public interface TopicService {
     public abstract List<Topic> getAllTopices();
     public abstract Topic getTopicById(int topicId);
     public abstract boolean addTopic(Topic topic);
     public abstract void updateTopic(Topic topic);
     public abstract void deleteTopic(int topicId);
}
