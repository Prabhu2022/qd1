package com;

import java.util.List;

public interface YoutubeRepo  {
	
	  int save(YoutubeVideo video);
	  int update(YoutubeVideo video);
	  YoutubeVideo findById(Long id);
	  int deleteById(Long id);
	  List<YoutubeVideo> findAll();
	  List<YoutubeVideo> findByPublished(boolean published);
	  List<YoutubeVideo> findByTitleContaining(String title);
	  int deleteAll();
	
	

}
