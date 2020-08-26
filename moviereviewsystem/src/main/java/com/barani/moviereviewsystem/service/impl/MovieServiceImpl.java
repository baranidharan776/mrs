/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.barani.moviereviewsystem.model.Movie;
import com.barani.moviereviewsystem.model.MovieDto;
import com.barani.moviereviewsystem.repository.MovieRepository;
import com.barani.moviereviewsystem.service.MovieService;

/**
 * @author baran
 *
 */
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieMapper mapper;

	@Override
	public MovieDto create(MovieDto dto, MultipartFile file) {
		if (!file.isEmpty())
			try {
				dto.setPoster(file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Movie movie = mapper.map(dto);
		movie = this.movieRepository.save(movie);
		return mapper.map(movie);
	}

	@Override
	public List<MovieDto> getMovieDetails() {
		List<Movie> movieList = this.movieRepository.findAll();
		List<MovieDto> dtoList = new LinkedList<MovieDto>();
		if (!movieList.isEmpty()) {
			for (Movie movie : movieList) {
				dtoList.add(mapper.map(movie));
			}
		}
		return dtoList;
	}
	

}
