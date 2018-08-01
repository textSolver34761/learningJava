package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void add(@RequestBody Topic topic ) {
		topicserives.add(topic);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}")
	public void update(@RequestBody Topic topic, @PathVariable String id) {
		topicserives.add(topic);
	}

}
