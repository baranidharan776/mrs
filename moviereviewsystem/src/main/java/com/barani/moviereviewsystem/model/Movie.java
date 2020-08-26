/**
 * 
 */
package com.barani.moviereviewsystem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author baran Model class for Movie
 */
@Entity
@Table(name = "Movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_seq")
	@GenericGenerator(name = "movie_seq", strategy = "com.barani.moviereviewsystem.model.PrimaryIdGenerator", parameters = {
			@Parameter(name = PrimaryIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = PrimaryIdGenerator.VALUE_PREFIX_PARAMETER, value = "MOVIE"),
			@Parameter(name = PrimaryIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@Column(name = "MOVIE_ID")
	private String movieId;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "POSTER", length = 1000)
	private byte[] picByte;

	@OneToMany(targetEntity = Review.class, mappedBy = "movieId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Review> reviews;

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

	
	/**
	 * @return the picByte
	 */
	public byte[] getPicByte() {
		return picByte;
	}

	/**
	 * @param picByte the picByte to set
	 */
	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	

}
