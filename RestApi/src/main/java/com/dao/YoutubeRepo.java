package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.YoutubeVideo;

public interface YoutubeRepo extends CrudRepository<YoutubeVideo, String> {
	
	

}
