package com.mahantesh.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahantesh.demo.controller.Library;
import com.mahantesh.demo.repository.LibraryRepo;

@Service
public class developservice {

	@Autowired
	public LibraryRepo subrepo;
	
	public List<Library> getAllsubjects()
	{
		List<Library> subjects= new ArrayList<>();
		subrepo.findAll().forEach(subjects::add);
		return subjects;
	}
	public void addSubject(Library library)
	{
		subrepo.save(library);
	}
	public void updateSubject(int id,Library library)
	{
		subrepo.save(library);
	}
	public void deleteSubject(int id)
	{
		subrepo.deleteById(id);
		
	}
	
}
