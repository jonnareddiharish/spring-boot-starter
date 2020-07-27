package com.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beans.Topic;
import com.service.TopicService;

@RestController
public class Controller {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics()
	{
		return topicService.getList();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getList().stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	//@RequestMapping(method = RequestMethod.POST, value = "/addtopic")
	//both the annotations are same but by default request mapping uses get method
	@PostMapping("/addtopic")
	public void postTopic(@RequestBody Topic topic) 
	{
		List list = topicService.getList();
		list.add(topic);
		topicService.setList(list);
	}
	
	//put is basically called as update
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) 
	{
		topicService.updateTopic(topic,id);
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id) 
	{
		topicService.deleteTopic(id);
	}
}
