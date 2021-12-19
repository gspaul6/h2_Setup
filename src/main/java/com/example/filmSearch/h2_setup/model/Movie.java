package com.example.filmSearch.h2_setup.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
/**
 *  @author Gurpratap Singh Paul
 * This is the Entity class Movie which maps Movie Table
 * Here we have used Many to Many Mapping Between Actor and Movie Table
 * Also Many to One mapping Between Director and Movie Table
 */
@Entity
@Data
@Table(name="movie")
public class Movie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="date")
	private LocalDate date;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="director_id")
	private Director director;

	@ManyToMany(mappedBy ="movies")
	private List<Actor> actors =new ArrayList<>();
	





	public void setActors(Actor actors) {
		this.actors.add(actors);
	}



	public Movie(String title, LocalDate date, Director director) {
		super();
		this.title = title;
		this.date = date;
		this.director = director;
	}



	public Movie(String title, LocalDate date) {
				
		this.title = title;
		this.date = date;
		
	}

	
	
	public Movie() {
			}


	public int getId() {
		return id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Director getDirector() {
		return this.director;
	}

	
	
	
}

