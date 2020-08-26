/**
 * 
 */
package com.barani.moviereviewsystem.model;

import java.util.List;

/**
 * @author baran
 *
 */
public class MovieDto {

	private String movieId;
	
	private String title;
	
	private String description;
	
	private byte[] poster;
	
	private List<ReviewDto> reviews;
	

	
	/**
	 * @return the reviews
	 */
	public List<ReviewDto> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<ReviewDto> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the poster
	 */
	public byte[] getPoster() {
		return poster;
	}

	/**
	 * @param poster the poster to set
	 */
	public void setPoster(byte[] poster) {
		this.poster = poster;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
}
