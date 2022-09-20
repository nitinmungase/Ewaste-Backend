package com.bezkoder.springjwt.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Ewaste;
import com.bezkoder.springjwt.models.Tutorial;
import com.bezkoder.springjwt.repository.TutorialRepository;
import com.bezkoder.springjwt.security.services.EwasteService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	TutorialRepository tutorialRepository;
	
	@Autowired
	private EwasteService ewasteService;
	
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  //public String userAccess() {
  //  return "User Content.";
 // }
  public List<Ewaste> getItems(){
		return this.ewasteService.getItems();
	}
  /*public ResponseEntity<List<Tutorial>> getAllTutorials(@Valid @RequestParam(required = false) String title) {
		try {
			List<Tutorial> tutorials = new ArrayList<Tutorial>();

			if (title == null)
				tutorialRepository.findAll().forEach(tutorials::add);
			else
				tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
  
  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }
}
