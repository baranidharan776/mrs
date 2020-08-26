/**
 * 
 */
package com.barani.moviereviewsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.barani.moviereviewsystem.model.MovieDto;
import com.barani.moviereviewsystem.service.MovieService;

/**
 * @author baran
 *
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/movies")
class MovieController {

	@Autowired
    private MovieService movieService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    MovieDto create(@RequestParam("title") String title,@RequestParam("description") String description,@RequestParam MultipartFile file) {
    	MovieDto dto = new MovieDto();
    	dto.setTitle(title);
    	dto.setDescription(description);
    	return movieService.create(dto, file);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    List<MovieDto> getMovieDetails()
    {
		return movieService.getMovieDetails();
    	
    }

}
