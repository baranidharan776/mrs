/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barani.moviereviewsystem.model.Movie;
import com.barani.moviereviewsystem.model.Review;
import com.barani.moviereviewsystem.model.ReviewDto;
import com.barani.moviereviewsystem.model.User;
import com.barani.moviereviewsystem.repository.MovieRepository;
import com.barani.moviereviewsystem.repository.UserRepository;

/**
 * @author baran
 *
 */
@Component
public class ReviewMapper {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MovieRepository movieRepo;
	
	 ReviewDto map(Review review) {
	        ReviewDto dto = new ReviewDto();
	        dto.setReviewId(review.getReviewId());
	        dto.setTitle(review.getTitle());
	        dto.setDescription(review.getDescription());
	        dto.setRating(review.getRating());
	        dto.setUser(review.getReviewer().getUserName());
	        dto.setMovieId(review.getMovieId().getMovieId());
	        return dto;
	    }

	    Review map(ReviewDto dto) {
	        Review review = new Review();
	        if (dto.getReviewId() != null) {
	            review.setReviewId(dto.getReviewId());
	        }
	        review.setTitle(dto.getTitle());
	        review.setDescription(dto.getDescription());
	        review.setRating(dto.getRating());
	        Optional<User> user=this.userRepo.findById(dto.getUser());
	        if(user.isPresent())
	        review.setReviewer(user.get());
	        Optional<Movie> movie=this.movieRepo.findById(dto.getMovieId());
	        if(user.isPresent())
	        review.setMovieId(movie.get());
	        return review;
	    }

}
