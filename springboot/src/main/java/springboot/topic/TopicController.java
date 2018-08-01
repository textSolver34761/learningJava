package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicSerices topicserives;
	
	@RequestMapping("/topics")
	public List<Topic> GetAllTopics() {
		return topicserives.getAll();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic get(@PathVariable String id) {
		return topicserives.get(id);
	}

}
