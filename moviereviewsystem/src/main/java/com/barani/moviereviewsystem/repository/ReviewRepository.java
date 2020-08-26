/**
 * 
 */
package com.barani.moviereviewsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.barani.moviereviewsystem.model.Review;

/**
 * @author baran
 *
 */
@Repository
public interface ReviewRepository extends JpaRepository<Review, String>, JpaSpecificationExecutor<Review> {
	

}
