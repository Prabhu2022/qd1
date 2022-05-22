package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcYoutubeRepo implements YoutubeRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(YoutubeVideo youVideo) {
		return jdbcTemplate.update("INSERT INTO videos (title, description, published) VALUES(?,?,?)",
		        new Object[] { youVideo.getTitle(), youVideo.getDescription(), youVideo.isPublished() });
		
	}

	@Override
	public int update(YoutubeVideo youVideo) {
		return jdbcTemplate.update("UPDATE videos SET title=?, description=?, published=? WHERE id=?",
		        new Object[] { youVideo.getTitle(), youVideo.getDescription(), youVideo.isPublished(), youVideo.getId() });
		  }
	

	@Override
	public YoutubeVideo findById(Long id) {
		try {
			YoutubeVideo youVideo = jdbcTemplate.queryForObject("SELECT * FROM videos WHERE id=?",
		          BeanPropertyRowMapper.newInstance(YoutubeVideo.class), id);
		      return youVideo;
		    } catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		    }
	}

	@Override
	public int deleteById(Long id) {
		 return jdbcTemplate.update("DELETE FROM videos WHERE id=?", id);
	}

	@Override
	public List<YoutubeVideo> findAll() {
		return jdbcTemplate.query("SELECT * from videos", BeanPropertyRowMapper.newInstance(YoutubeVideo.class));
		
	}

	@Override
	public List<YoutubeVideo> findByPublished(boolean published) {
		return jdbcTemplate.query("SELECT * from videos WHERE published=?",
		        BeanPropertyRowMapper.newInstance(YoutubeVideo.class), published);
	}

	@Override
	public List<YoutubeVideo> findByTitleContaining(String title) {
		String q = "SELECT * from videos WHERE title ILIKE '%" + title + "%'";
	    return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(YoutubeVideo.class));
	}

	@Override
	public int deleteAll() {
		 return jdbcTemplate.update("DELETE from videos");
	}

	
	

	
}
