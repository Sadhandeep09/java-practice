package com.perito.collection;

import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable 
public class Movie implements  Comparator<Movie>	{// Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year

	/*public int compareTo(Movie m) {
		return m.year - this.year;
	}
*/
	
	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		return m2.year-m1.year;
	}
	
	// Constructor
	public Movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}
	
	public Movie()	{
		
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		list.add(new Movie("Return of the Jedi2", 8.4, 1983));

	//	Collections.sort(list);
		Collections.sort(list, new Movie() );
		
		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}
}