package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.YoutubeVideo;
import com.service.VideoService;

@RestController
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	
	@RequestMapping("/videos")
	public List<YoutubeVideo> getAllVideos()
	{
		
		return videoService.getAllVideos();
	}

	
}
