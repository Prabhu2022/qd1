 package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class VideoService {
	
	private List<YoutubeVideo> videos =new ArrayList<> (Arrays.asList(
			
			new YoutubeVideo("java","java app","java desc"),
			new YoutubeVideo("Spring","Spring app","Spring desc"),
			new YoutubeVideo("mysql","mysql app","mysql desc")));
	
	public List<YoutubeVideo> getAllVideos()
	{
		return videos;
	}

	public YoutubeVideo getVideo(String name)
	{
		return videos.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}

	public void addVideo(YoutubeVideo video) {
		
		videos.add(video);
		
	}

	public void updateVideo(String name, YoutubeVideo video) {
		
		for	(int i=0;i<videos.size();i++)
		{
			YoutubeVideo t=videos.get(i);
			if(t.getName().equals(name))
			{
				videos.set(i, video);
				return;
			}
		}
		
	}

	public void deleteVideo(String name) {
		videos.removeIf(t->t.getName().equals(name));
		
	}
	
	
}
