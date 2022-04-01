package com.mahantesh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mahantesh.demo.service.developservice;

@RestController
public class Librarycontroller {
	
	@Autowired
	private developservice subjectService;
	
	@RequestMapping("/ADDBOOK")
	public List<Library> getAllSubjects()
	{
		return subjectService.getAllsubjects();
	}
	 
	 @RequestMapping(method = RequestMethod.POST,value="/ADDBOOK")
	 public String addSubject(@RequestBody Library library)
	 {
		 subjectService.addSubject(library);
		 return "added successfully";
	 } 
	 @RequestMapping(method = RequestMethod.PUT,value="/ADDBOOK/{id}")
	 public String updateSubject(@PathVariable int id,@RequestBody Library library)
	 {
		 subjectService.updateSubject(id, library);
		 return "updated successfully";
		 
	 }
	 @RequestMapping(method = RequestMethod.DELETE,value="/ADDBOOK/{id}")
	 public String DeleteSubject(@PathVariable int id)
	 {
		 subjectService.deleteSubject(id);
		 return "deleted successfully";
	 }
	 }
