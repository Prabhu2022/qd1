package com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	
	@RequestMapping("/videos")
	public List<YoutubeVideo> getAllVideos()
	{
		
		return videoService.getAllVideos();
	}

	@RequestMapping("/videos/{id}")
	public Optional<YoutubeVideo> getVideo(@PathVariable String id)
	{
		return videoService.getVideo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/videos")
	public void addVideo(@RequestBody YoutubeVideo video)
	{
		videoService.addVideo(video);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/videos/{id}")
	public void updateVideo(@RequestBody YoutubeVideo video,@PathVariable String id)
	{
		videoService.updateVideo(id,video);
		
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/videos/{id}")
	public void deleteVideo(@PathVariable String id)
	{
		videoService.deleteVideo(id);
		
	}
}
