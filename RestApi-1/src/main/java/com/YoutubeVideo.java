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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	//@Lob
	//private byte[] data;
	
	public YoutubeVideo() {
		super();
	}
	
	
	public YoutubeVideo(String name,String title, String description) {
		super();
		this.name = name;
		this.title = title;
		this.description = description;
		//this.data = data;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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

	

	@Override
	public String toString() {
		return "YoutubeVideo [id=" + id + ",name=" + name + ", title=" + title + ", desc=" + description +"]";
	}
}
