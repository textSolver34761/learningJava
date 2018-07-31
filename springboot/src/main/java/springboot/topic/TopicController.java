package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> GetAllTopics() {
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Randdom description"),
				new Topic("Java","Java 8.1","Java description"),
				new Topic("PHP","PHP7","PHP description"),
				new Topic("Laravel","Laravel Framework","Laravel description"),
				new Topic("Python","Python","Python description")
				);
	}

}
