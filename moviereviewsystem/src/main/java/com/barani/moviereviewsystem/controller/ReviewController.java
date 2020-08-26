/**
 * 
 */
package com.barani.moviereviewsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.barani.moviereviewsystem.model.ReviewDto;
import com.barani.moviereviewsystem.service.ReviewService;

/**
 * @author baran
 *
 */
@RestController
@RequestMapping("/api/reviews")
class ReviewController {

	@Autowired
    private ReviewService reviewService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ReviewDto create(@RequestBody ReviewDto dto) {
        return reviewService.createReview(dto);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ReviewDto> getReviewDetails(@RequestParam(name = "movie_id") String movieId)
    {
		return reviewService.getReviews(movieId);
    	
    }

}
