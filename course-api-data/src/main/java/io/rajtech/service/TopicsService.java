package io.rajtech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rajtech.entity.Topic;
import io.rajtech.repository.TopicRepository;

@Service
public class TopicsService {

	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public void addTopics(Topic t) {
		topicRepository.save(t);
	}
	
	

	public Optional<Topic> getTopic(long id) {
		return topicRepository.findById(id);
	}
	
	public Optional<Topic> getTopic1(long id) {
		return topicRepository.findById(id);
	}

	public void updateTopic(Topic t) {
		topicRepository.save(t);
	}
	
	public void updatePatchTopic(Topic t, long id)
	{
		topicRepository.save(t);
	}
	
	public void removeTopic(long id) {
		topicRepository.deleteById(id);
	}

}
