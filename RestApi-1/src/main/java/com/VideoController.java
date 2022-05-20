package com;

import java.util.List;

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

	@RequestMapping("/videos/{name}")
	public YoutubeVideo getVideo(@PathVariable String name)
	{
		return videoService.getVideo(name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/videos")
	public void addVideo(@RequestBody YoutubeVideo video)
	{
		videoService.addVideo(video);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/videos/{name}")
	public void updateVideo(@RequestBody YoutubeVideo video,@PathVariable String name)
	{
		videoService.updateVideo(name,video);
		
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/videos/{name}")
	public void deleteVideo(@PathVariable String name)
	{
		videoService.deleteVideo(name);
		
	}
}
