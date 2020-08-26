/**
 * 
 */
package com.barani.moviereviewsystem.service;

import com.barani.moviereviewsystem.model.UserDto;

/**
 * @author baran
 *
 */
public interface UserService {
	
	public Boolean authorizeUser(UserDto user);

	public UserDto getUser(String userName);

}
