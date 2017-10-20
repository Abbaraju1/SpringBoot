package io.aditya.sprintbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

// This is a Business Service

@Service
public class TopicService {

	// if we make new Arralist in the right side we are making it as mutable.

	// If we dont create a new and we directly assign arrays.aslist to topics
	//then it is immutable and we cannot add another topic object to it 
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascript Description")
			));  

	public List<Topic> geAllTopics(){
		return topics;
	}

	public Topic getTopic(String id){
		return topics.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// JAVA 7 way to update the list
		
		/*for(int i=0; i< topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/

		//Tried JAVA 8 // need more practice
		topics.set(IntStream.range(0, topics.size())
				.filter(t-> topics.get(t).getId().equals(id))
				.findFirst()
				.getAsInt(), topic);
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
