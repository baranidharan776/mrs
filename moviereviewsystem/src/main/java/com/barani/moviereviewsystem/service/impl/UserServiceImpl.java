/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barani.moviereviewsystem.model.User;
import com.barani.moviereviewsystem.model.UserDto;
import com.barani.moviereviewsystem.repository.UserRepository;
import com.barani.moviereviewsystem.service.UserService;

/**
 * @author baran
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public Boolean authorizeUser(UserDto dto) {
		Optional<User> user = this.userRepository.findById(dto.getUsername());
		if(user.isPresent())
		{
			User record = user.get();
			if(record.getPassword().equals(dto.getPassword()))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public UserDto getUser(String userName) {
		Optional<User> user = this.userRepository.findById(userName);
		if(user.isPresent())
		{
			return mapper.map(user.get());
		}
		else
		{
			return null;
		}
	}

}
