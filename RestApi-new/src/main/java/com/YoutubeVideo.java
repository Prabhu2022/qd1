package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table (name="youtube")
public class YoutubeVideo {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	public YoutubeVideo() {
		super();
	}
	
	
	public YoutubeVideo(String id,String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
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

	
/*
	@Override
	public String toString() {
		return "YoutubeVideo [id=" + id + ", title=" + title + ", desc=" + description +"]";
	} */
}
