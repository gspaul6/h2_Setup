package com.example.filmSearch.h2_setup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.serviceImplementation.DirectorServiceImplementation;

import lombok.RequiredArgsConstructor;

@RestController
//Ici cette classe va répondre aux requêtes `/exemples`
@RequestMapping("/film")
@CrossOrigin
@RequiredArgsConstructor
public class H2Controller {

	
	@Autowired
	private DirectorServiceImplementation directorServiceImplementation;
	
	
	@GetMapping
	public ResponseEntity<List<Movie>> mirroredFunction(@RequestParam("directorName") String directorName) {
		return ResponseEntity.status(HttpStatus.OK).body(this.directorServiceImplementation.getMovie(directorName));
	}

}
