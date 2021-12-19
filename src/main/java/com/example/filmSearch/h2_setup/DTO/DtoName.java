package com.example.filmSearch.h2_setup.DTO;

public class DtoName {
	
	private String name;

	public DtoName() {
		
	}

	public DtoName(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DtoName [name of the movie =" + name + "]";
	}
	

}
