package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Video;


public interface VideoRepo extends CrudRepository<Video, Long> {
	
	List<Video> findByPublished(boolean published);
	  List<Video> findByTitleContaining(String title);
	

}
