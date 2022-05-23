package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
	
	
	@Autowired
	private YoutubeRepo youRepo;
	
	@GetMapping("/videos")
	  public ResponseEntity<List<YoutubeVideo>> getAllVideos(@RequestParam(required = false) String title) {
	    try {
	      List<YoutubeVideo> youVideo = new ArrayList<YoutubeVideo>();
	      if (title == null)
	    	  youRepo.findAll().forEach(youVideo::add);
	      else
	    	  youRepo.findByTitleContaining(title).forEach(youVideo::add);
	      if (youVideo.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(youVideo, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/videos/{id}")
	  public ResponseEntity<YoutubeVideo> getVideolById(@PathVariable("id") long id) {
		  YoutubeVideo youVideo = youRepo.findById(id);
	    if (youVideo != null) {
	      return new ResponseEntity<>(youVideo, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  @PostMapping("/videos")
	  public ResponseEntity<String> createVideo(@RequestBody YoutubeVideo youVideo) {
	    try {
	    	youRepo.save(new YoutubeVideo(youVideo.getTitle(), youVideo.getDescription(), false));
	      return new ResponseEntity<>("Video was created successfully.", HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @PutMapping("/videos/{id}")
	  public ResponseEntity<String> updateVideo(@PathVariable("id") long id, @RequestBody YoutubeVideo youVideo) {
		  YoutubeVideo _youVideo = youRepo.findById(id);
	    if (_youVideo != null) {
	    	_youVideo.setId(id);
	    	_youVideo.setTitle(youVideo.getTitle());
	    	_youVideo.setDescription(youVideo.getDescription());
	    	_youVideo.setPublished(youVideo.isPublished());
	      youRepo.update(_youVideo);
	      return new ResponseEntity<>("Videos was updated successfully.", HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>("Cannot find Video with id=" + id, HttpStatus.NOT_FOUND);
	    }
	  }
	  @DeleteMapping("/videos/{id}")
	  public ResponseEntity<String> deleteVideos(@PathVariable("id") long id) {
	    try {
	      int result = youRepo.deleteById(id);
	      if (result == 0) {
	        return new ResponseEntity<>("Cannot find video with id=" + id, HttpStatus.OK);
	      }
	      return new ResponseEntity<>("Video was deleted successfully.", HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>("Cannot delete video.", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @DeleteMapping("/videos")
	  public ResponseEntity<String> deleteAllVideos() {
	    try {
	      int numRows = youRepo.deleteAll();
	      return new ResponseEntity<>("Deleted " + numRows + " video(s) successfully.", HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>("Cannot delete videos.", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/videos/published")
	  public ResponseEntity<List<YoutubeVideo>> findByPublished() {
	    try {
	      List<YoutubeVideo> youVideo = youRepo.findByPublished(true);
	      if (youVideo.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(youVideo, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
