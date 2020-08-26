/**
 * 
 */
package com.barani.moviereviewsystem.service;

import java.util.List;

import com.barani.moviereviewsystem.model.ReviewDto;

/**
 * @author baran
 *
 */
public interface ReviewService {
	
	ReviewDto createReview(ReviewDto review);
	
	List<ReviewDto> getReviews(String movieId);

}
