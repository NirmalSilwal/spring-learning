package io.javabrains.springbootquickstart.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "EA", "Enterprise Applications"),
            new Topic("2", "WAP", "Web Application Programming"),
            new Topic("3", "WAA", "Web Application Architecture"),
            new Topic("4", "SA", "Software Architecture")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic newTopic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic currentTopic = topics.get(i);
            if (currentTopic.getId().equals(id)) {
                topics.set(i, newTopic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        for (int i = 0; i < topics.size(); i++) {
            Topic currentTopic = topics.get(i);
            if (currentTopic.getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
    }
}
