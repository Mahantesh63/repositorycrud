package com.mahantesh.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahantesh.demo.controller.Library;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer> {

	

	

}
