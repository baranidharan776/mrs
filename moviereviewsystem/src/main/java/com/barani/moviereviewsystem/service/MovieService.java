/**
 * 
 */
package com.barani.moviereviewsystem.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.barani.moviereviewsystem.model.MovieDto;

/**
 * @author baran
 *
 */
public interface MovieService {

	MovieDto create(MovieDto dto, MultipartFile file);
	
	List<MovieDto> getMovieDetails();
	

}
