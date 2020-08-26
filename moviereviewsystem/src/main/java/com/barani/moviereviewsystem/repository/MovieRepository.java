/**
 * 
 */
package com.barani.moviereviewsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barani.moviereviewsystem.model.Movie;

/**
 * @author baran
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

}
