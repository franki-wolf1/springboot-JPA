package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Topic;
import com.ejemplo.crudfast.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @PostMapping
    public Topic saveTopic (@RequestBody Topic topic) {
        topicService.saveOrUpdateTopic(topic);
        return topic;
    }

    @DeleteMapping("/{topicId}")
    public String deleteTopic(@PathVariable("topicId") Long topicId) {
        topicService.deleteTopic(topicId);
        return "topic deleted";
    }

    @GetMapping("/{topicId}")
    public Optional<Topic> getByIDTopic(@PathVariable("topicId") Long topicId) {
        return topicService.getTopic(topicId);
    }
}
