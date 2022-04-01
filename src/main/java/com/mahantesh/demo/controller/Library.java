package com.mahantesh.demo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="report2")
public class Library {
	
	
	@Column (name="timings")
	private String timings;
	
	@Column (name="work_to_do")
	private String work_to_do;
	
	@Id
	@Column (name="id")
	private int id;
	
	
	
	
	
	
	

	public Library() {
		super();
		
	}

	public Library(String timings, String work_to_do, int id) {
		super();
		this.timings = timings;
		this.work_to_do = work_to_do;
		this.id = id;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getWork_to_do() {
		return work_to_do;
	}

	public void setWork_to_do(String work_to_do) {
		this.work_to_do = work_to_do;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
