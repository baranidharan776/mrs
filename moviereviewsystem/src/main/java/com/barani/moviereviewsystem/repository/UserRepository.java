/**
 * 
 */
package com.barani.moviereviewsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barani.moviereviewsystem.model.User;

/**
 * @author baran
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	Optional<User> findByUserName(String userName);

}
