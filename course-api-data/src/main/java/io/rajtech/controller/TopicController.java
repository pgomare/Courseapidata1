package io.rajtech.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.rajtech.entity.Topic;
import io.rajtech.service.TopicsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TopicController {

	@Autowired
	private TopicsService topicsService;
	Logger log = LoggerFactory.getLogger(TopicController.class);

	@GetMapping(path = "/topics", produces = {  MediaType.APPLICATION_JSON_VALUE })
	public List<Topic> getAllTopic() {
		log.info("message@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return topicsService.getAllTopics();
	}

	// get singal topic
	@GetMapping(path = "/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable long id) {
		return topicsService.getTopic(id);

	}

	// get singel topic
	@GetMapping("/topicsparam")
	public Optional<Topic> getTopicbyRequestParam(@RequestParam(required = true) long id) {
		return topicsService.getTopic(id);

	}

	@PostMapping(path = "/topicsadd", consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	private void addTopic(@RequestBody Topic topic) {
		topicsService.addTopics(topic);
	}

	@PutMapping("/topicsupdate")
	public void updateTopic(@RequestBody Topic topic) {
		topicsService.updateTopic(topic);
	}

	@PatchMapping("/topicspatchupdate/{id}")
	public void updatepatchTopic(@RequestBody Topic topic, @PathVariable long id) {
		topicsService.updatePatchTopic(topic, id);
	}

	@DeleteMapping("/topicsdelete/{id}")
	public void deleteTopic(@PathVariable long id) {
		topicsService.removeTopic(id);
	}

}
