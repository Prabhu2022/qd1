package com;

import org.springframework.stereotype.Component;

@Component
public class YoutubeVideo {

	
	private Long id;
		
	private String title;
		
	private String description;
	
	private boolean published;
	
	public YoutubeVideo() {
		super();
	}

	
	public YoutubeVideo(Long id, String title, String description, boolean published) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	
	public YoutubeVideo(String title, String description, boolean published) {
		super();
		this.title = title;
		this.description = description;
		this.published = published;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}


	@Override
	public String toString() {
		return "YoutubeVideo [id=" + id + ", title=" + title + ", description=" + description + ", published="
				+ published + "]";
	}
	
	

}
