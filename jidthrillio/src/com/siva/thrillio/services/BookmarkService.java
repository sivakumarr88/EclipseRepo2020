package com.siva.thrillio.services;

import com.siva.thrillio.entities.Book;
import com.siva.thrillio.entities.Movie;
import com.siva.thrillio.entities.WebLink;

public class BookmarkService {

	private static BookmarkService instance = new BookmarkService();

	private BookmarkService() {
	}

	public static BookmarkService getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie(id, title, profileUrl, releaseYear, cast, directors, genre, imdbRating);
		return movie;
	}

	public Book createBook(long id, String title, int publicationYear, String publisher,
			String[] authors, String genre, double amazonRating) {
		Book book = new Book(id, title, publicationYear, publisher, authors, genre, amazonRating);
		return book;
	}

	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink webLink = new WebLink(id, title, url, host);
		return webLink;
	}

}
