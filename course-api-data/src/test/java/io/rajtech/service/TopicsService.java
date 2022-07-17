/*
 * package io.rajtech.service;
 * 
 * import static org.mockito.Mockito.when;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import org.mockito.InjectMocks; import
 * org.mockito.Mock; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import io.rajtech.entity.Topic; import io.rajtech.repository.TopicRepository;
 * 
 * @SpringBootTest public class TopicsService {
 * 
 * @InjectMocks TopicsService service;
 * 
 * @Mock TopicRepository repository;
 * 
 * @Test public void getAllTopicsTest() { List<Topic> list = new ArrayList<>();
 * Topic t1 = new Topic(1, "Java", "Core Java"); Topic t2 = new Topic(2,
 * "C Languge", "C Lang All Topics"); Topic t3 = new Topic(1, "C++ Languge",
 * "C++ Lang All Topics");
 * 
 * list.add(t1); list.add(t2); list.add(t3);
 * 
 * when(repository.findAll()).thenReturn(list); }
 * 
 * }
 */