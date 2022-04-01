package com.mahantesh.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mahantesh.demo.controller.Library;
import com.mahantesh.demo.repository.LibraryRepo;

@SpringBootApplication
public class DemoApplication{
	@Autowired 
	LibraryRepo repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
	
	}
	
	//@Override
	//public void run(String[] args)
	 //{
		//Library lib=repository.findById(6).get();
		//System.out.println(lib.getWork_to_do());
		//Library en = new Library();
		//en.setTimings("12:00:00");
		//en.setWork_to_do("checkout the phone for some emergencies");
		//en.setId(10);
		//repository.save(en);
		//List<Library> allrecords = repository.findAll();
		//
		//for(Library item : allrecords)
		//{
//			System.out.println(item.getWork_to_do());
	//	}
		//repository.delete(en);
		
		
	//}
}
