package io.rajtech.controller;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import io.rajtech.repository.TopicRepository;

@WebMvcTest(TopicController.class)
public class TopicControllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@Mock 
	private TopicRepository repository;
	
}
