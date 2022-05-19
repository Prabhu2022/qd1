package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.VideoRepo;
import com.model.Video;

@RestController
public class ApiController {
	
	@Autowired
	private VideoRepo videoRepo;
	
	@Autowired
	private Video video;
	
	@RequestMapping("")
	public String showIndexPage1()
	{
		
		return "index";
	}
	
	 @GetMapping("/videos")
	  public ResponseEntity<List<Video>> getAllVideos(@RequestParam(required = false) String title) {
	    try {
	      List<Video> videos = new ArrayList<Video>();
	      if (title == null)
	    	  videoRepo.findAll().forEach(videos::add);
	      else
	    	  videoRepo.findByTitleContaining(title).forEach(videos::add);
	      if (videos.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(videos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 @GetMapping("/videos/{id}")
	  public ResponseEntity<Video> getVideoById(@PathVariable("id") long id) {
	    Optional<Video> videoData = videoRepo.findById(id);
	    if (videoData.isPresent()) {
	      return new ResponseEntity<>(videoData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	 
	 @PostMapping("/videos")
	  public ResponseEntity<Video> createVideo(@RequestBody Video _video) {
	    try {
	    	
	    	videoRepo.save(new Video(video.getTitle(), video.getDescription(), false));
	      return new ResponseEntity<>(_video, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 @PutMapping("/videos/{id}")
	  public ResponseEntity<Video> updateVideo(@PathVariable("id") long id, @RequestBody Video video) {
	    Optional<Video> videoData = videoRepo.findById(id);
	    if (videoData.isPresent()) {
	    	video = videoData.get();
	    	video.setTitle(video.getTitle());
	    	video.setDescription(video.getDescription());
	    	video.setPublished(video.isPublished());
	      return new ResponseEntity<>(videoRepo.save(video), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	 
	 @DeleteMapping("/videos/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    try {
	    	videoRepo.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @DeleteMapping("/videos")
	  public ResponseEntity<HttpStatus> deleteAllTutorials() {
	    try {
	    	videoRepo.deleteAll();
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @GetMapping("/videos/published")
	  public ResponseEntity<List<Video>> findByPublished() {
	    try {
	      List<Video> videos = videoRepo.findByPublished(true);
	      if (videos.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(videos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}


