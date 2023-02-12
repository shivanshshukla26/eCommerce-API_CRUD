package com.springrest.springrest.objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Objects {
	
	@Id
	private long id;
	private String title;
	private String description;
	@Override
	public String toString() {
		return "Objects [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Objects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Objects(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

}