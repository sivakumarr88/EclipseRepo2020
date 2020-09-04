package com.siva.thrillio.entities;

public class Movie extends Bookmark {

	private int releaseYear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double imdbRating;

	public Movie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors,
			String genre, double imdbRating) {
		super(id, title, profileUrl);
		this.releaseYear = releaseYear;
		this.cast = cast;
		this.directors = directors;
		this.genre = genre;
		this.imdbRating = imdbRating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirectors() {
		return directors;
	}

	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

}
