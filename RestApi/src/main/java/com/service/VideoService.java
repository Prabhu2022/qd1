package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.YoutubeVideo;

@Service
public class VideoService {
	
	private List<YoutubeVideo> videos = Arrays.asList(
			
			new YoutubeVideo("java","java desc","java"),
			new YoutubeVideo("java","java desc","java"),
			new YoutubeVideo("java","java desc","java"));
	
	public List<YoutubeVideo> getAllVideos()
	{
		return videos;
	}

}
