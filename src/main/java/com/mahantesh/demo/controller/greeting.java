package com.mahantesh.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class greeting{
	@Autowired
Greetings greeting;
	
AtomicLong counter=new AtomicLong();
	
	@GetMapping("/greeting")
	public Greetings greet(@RequestParam(value="name")String name)
	{
		greeting.setId(counter.incrementAndGet());
		greeting.setContent("u r learning from " +name);
		return greeting;
	}
}
