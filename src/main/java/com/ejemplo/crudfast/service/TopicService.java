package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.Topic;
import com.ejemplo.crudfast.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic>  getTopics() {
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopic(Long id) {
        return topicRepository.findById(id);
    }
    public void saveOrUpdateTopic (Topic student) {
        topicRepository.save(student);
    }
    public void deleteTopic (Long id) {
        topicRepository.deleteById(id);
    }
}
