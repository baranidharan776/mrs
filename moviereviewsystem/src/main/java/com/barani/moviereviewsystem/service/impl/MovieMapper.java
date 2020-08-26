/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barani.moviereviewsystem.helper.ImageFormatHelper;
import com.barani.moviereviewsystem.model.Movie;
import com.barani.moviereviewsystem.model.MovieDto;
import com.barani.moviereviewsystem.model.Review;
import com.barani.moviereviewsystem.model.ReviewDto;

/**
 * @author baran
 *
 */
@Component
class MovieMapper {

	@Autowired
	private ReviewMapper reviewMapper;
	
    MovieDto map(Movie movie) {
        MovieDto dto = new MovieDto();
        dto.setMovieId(movie.getMovieId());
        dto.setTitle(movie.getTitle());
        dto.setDescription(movie.getDescription());
        dto.setPoster(ImageFormatHelper.decompressBytes(movie.getPicByte()));
        if(!movie.getReviews().isEmpty())
        {
        	List<ReviewDto> reviewDto = new LinkedList<ReviewDto>();
        	for(Review review : movie.getReviews())
        	{
        		reviewDto.add(this.reviewMapper.map(review));
        	}
        	dto.setReviews(reviewDto);
        }
        return dto;
    }

    Movie map(MovieDto dto) {
        Movie movie = new Movie();
        if (dto.getMovieId() != null) {
            movie.setMovieId(dto.getMovieId());
        }
        movie.setTitle(dto.getTitle());
        movie.setDescription(dto.getDescription());
        movie.setPicByte(dto.getPoster());
        return movie;
    }
}