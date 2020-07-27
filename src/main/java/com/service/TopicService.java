package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beans.Topic;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class TopicService {
	private List<Topic> list = new ArrayList(Arrays.asList(
			new Topic("1","java","Enterprise edition content"),new Topic("2","python","machine learning stuff"))
			);

	public void updateTopic(Topic topic, String id) {
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getId().equals(id))
			{
				list.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		list.removeIf(t -> t.getId().equals(id));
		
	}
	
}
