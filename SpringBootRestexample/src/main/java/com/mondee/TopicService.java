package com.mondee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicList=new ArrayList<>(Arrays.asList(new Topic("1023" ,"JAVA","OOPS CONCETPS"),new Topic("1024","Hibernate","Configuration"),new Topic("1025","Spring","Dependencies")));
	
	
	
	public Topic getTopic(String id) {
		
		
		Topic x=null;
		for(Topic i:topicList) {
			if(i.getTid().equals(id))
				x=i;
		}
		return x;
	}
	public List<Topic> getAllTopics() {
		return topicList;
		
	}
}
