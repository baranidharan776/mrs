/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.barani.moviereviewsystem.model.Review;
import com.barani.moviereviewsystem.model.ReviewDto;
import com.barani.moviereviewsystem.repository.MovieRepository;
import com.barani.moviereviewsystem.repository.ReviewRepository;
import com.barani.moviereviewsystem.service.ReviewService;

/**
 * @author baran
 *
 */
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	@Autowired
	private ReviewMapper reviewMapper;

	@Autowired
	private MovieRepository movieRepo;

	@Override
	public ReviewDto createReview(ReviewDto reviewDto) {
		Review review = reviewMapper.map(reviewDto);
		review = this.reviewRepository.save(review);
		return reviewMapper.map(review);
	}

	@Override
	public List<ReviewDto> getReviews(String movieId) {
		Specification<Review> spec = byMovieId(movieId);
		List<Review> reviewList = this.reviewRepository.findAll(spec);
		List<ReviewDto> dtoList = new LinkedList<ReviewDto>();
		for (Review review : reviewList) {
			dtoList.add(reviewMapper.map(review));
		}
		return dtoList;
	}

	public static Specification<Review> byMovieId(String movieId) {
		return (root, query, cb) -> movieId == null ? null : cb.equal(root.get("movieId"), movieId);
	}
	
}
