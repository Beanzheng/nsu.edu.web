package com.ORM;

public class Movie {
	public Movie(){}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getMovieScore() {
		return movieScore;
	}
	public void setMovieScore(Integer movieScore) {
		this.movieScore = movieScore;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieScreenWriter() {
		return movieScreenWriter;
	}
	public void setMovieScreenWriter(String movieScreenWriter) {
		this.movieScreenWriter = movieScreenWriter;
	}
	public String getMovie_to_start() {
		return movie_to_start;
	}
	public void setMovie_to_start(String movie_to_start) {
		this.movie_to_start = movie_to_start;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public String getMovieProducerRegions() {
		return movieProducerRegions;
	}
	public void setMovieProducerRegions(String movieProducerRegions) {
		this.movieProducerRegions = movieProducerRegions;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public String getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}
	private String movieName;		
	private Integer movieScore;		
	private String movieDirector;	
	private String movieScreenWriter;	
	private String movie_to_start;		
	private String movietype;			
	private String movieProducerRegions;		
	private String movieLanguage;		
	private String movieTime;			
	private String movieImage;			
}
