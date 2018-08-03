package springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicSerices {
	
	@Autowired
	private TopicRepository topicrepo;
	
	private List <Topic> topics = new ArrayList <> (Arrays.asList(
			new Topic("Spring","Spring Framework","Randdom description"),
			new Topic("Java","Java 8.1","Java description"),
			new Topic("PHP","PHP7","PHP description"),
			new Topic("Laravel","Laravel Framework","Laravel description"),
			new Topic("Python","Python","Python description")
			));
	
	public List <Topic> getAll(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicrepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic get(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicrepo.findById(id);
	}

	public void add(Topic topic) {
		//topics.add(topic);
		topicrepo.save(topic);
		
	}

	public void update(String id, Topic topic) {
		/*for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicrepo.save(topic);
	}

	public void delete(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicrepo.deleteById(id);
	}
}
