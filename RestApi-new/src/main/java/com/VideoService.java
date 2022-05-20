 package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VideoService {
	
	@Autowired
	private YoutubeRepo youRepo;
	
	public List<YoutubeVideo> getAllVideos()
	{
		
		List<YoutubeVideo> videos=new ArrayList<>();
		youRepo.findAll()
		.forEach(videos::add);
		return videos;

	}

	public Optional<YoutubeVideo> getVideo(String id)
	{
		
		return youRepo.findById(id);
	}

	public void addVideo(YoutubeVideo video) {
		
		youRepo.save(video);
		
	}

	public void updateVideo(String id, YoutubeVideo video) {
		
		youRepo.save(video);
		
	}

	public void deleteVideo(String id) {
		
		youRepo.deleteById(id);
	}
	
	
}
