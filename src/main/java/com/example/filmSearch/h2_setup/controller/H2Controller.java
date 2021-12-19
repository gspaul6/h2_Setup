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

import com.example.filmSearch.h2_setup.DTO.DtoName;
import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.serviceImplementation.ActorServiceImplementation;
import com.example.filmSearch.h2_setup.serviceImplementation.DirectorServiceImplementation;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
/**
 *  @author Gurpratap Singh Paul
 * This is the controller with the end points. 
 * we have used an Rest Api to make calls, Given an endpoint with requesting a parameter
 * it returns for each an DTO object hence cutting direct relation to the client
 * 
 */
@RestController
//Ici cette classe va répondre aux requêtes `/exemples`
@RequestMapping("/film")
@CrossOrigin
@RequiredArgsConstructor
@NoArgsConstructor
public class H2Controller {

	
	@Autowired
	private DirectorServiceImplementation directorServiceImplementation;
	
	@Autowired
	private ActorServiceImplementation actorServiceImplementation;
	
	// /film/directorName?directorName=xxx
	/**
	*
	* @author Gurpratap Singh Paul
	* @param directorName
	* @return List<DtoName>
	* @since 
	* @version 
	* @exception 
	*/
	@GetMapping("/directorName")	
	public ResponseEntity<List<DtoName>> getMovieFromDirectorName(@RequestParam("directorName") String directorName) {
		return ResponseEntity.status(HttpStatus.OK).body(this.directorServiceImplementation.getMovie(directorName));
	}

	// /film/actorName?actorName=xxx
	//http://localhost:8080/film/actorName?actorName=Mark Hamil
	/**
	*
	* @author Gurpratap Singh Paul
	* @param actorName
	* @return List<DtoName>
	* @since 
	* @version 
	* @exception 
	*/
	@GetMapping("/actorName")
	public ResponseEntity<List<DtoName>> getMovieFromActorName(@RequestParam("actorName") String actorName) {
		return ResponseEntity.status(HttpStatus.OK).body(this.actorServiceImplementation.getMovie(actorName));
	}
	
	// /film/filmName?actorName=xxx
	//http://localhost:8080/film/filmName?filmName=Indiana Jones - Les aventuriers de l'arche perdue
	/**
	*
	* @author Gurpratap Singh Paul
	* @param filmName
	* @return List<DtoName>
	* @since 
	* @version 
	* @exception 
	*/
	@GetMapping("/filmName")		
	public ResponseEntity<List<DtoName>> getActorFromMovieName(@RequestParam("filmName") String filmName) {
		return ResponseEntity.status(HttpStatus.OK).body(this.actorServiceImplementation.getActor(filmName));
	}	
		
}
