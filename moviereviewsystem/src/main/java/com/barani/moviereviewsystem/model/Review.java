/**
 * 
 */
package com.barani.moviereviewsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author baran
 *
 */
@Entity
@Table(name = "Review")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_seq")
	@GenericGenerator(name = "review_seq", strategy = "com.barani.moviereviewsystem.model.PrimaryIdGenerator", parameters = {
			@Parameter(name = PrimaryIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = PrimaryIdGenerator.VALUE_PREFIX_PARAMETER, value = "REVIEW"),
			@Parameter(name = PrimaryIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })

	private String reviewId;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "RATING")
	private Integer rating;

	@ManyToOne
	@JoinColumn(name = "REVIEWER", referencedColumnName = "USERNAME", insertable = false, updatable = false)
	private User reviewer;

	@ManyToOne
	@JoinColumn(name = "MOVIE_ID", referencedColumnName = "MOVIE_ID", insertable = false, updatable = false)
	private Movie movieId;

	@Column(name = "REVIEW_AT")
	private Date reviewAt;

	/**
	 * @return the reviewId
	 */
	public String getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
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
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the reviewer
	 */
	public User getReviewer() {
		return reviewer;
	}

	/**
	 * @param reviewer the reviewer to set
	 */
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	/**
	 * @return the movieId
	 */
	public Movie getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Movie movieId) {
		this.movieId = movieId;
	}
}
