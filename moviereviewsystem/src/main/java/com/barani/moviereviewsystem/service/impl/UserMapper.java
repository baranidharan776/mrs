/**
 * 
 */
package com.barani.moviereviewsystem.service.impl;

import org.springframework.stereotype.Component;

import com.barani.moviereviewsystem.model.User;
import com.barani.moviereviewsystem.model.UserDto;

/**
 * @author baran
 *
 */
@Component
class UserMapper {

    UserDto map(User User) {
        UserDto dto = new UserDto();
        dto.setUsername(User.getUserName());
        dto.setPassword(dto.getPassword());
        return dto;
    }

    User map(UserDto dto) {
        User User = new User();
        User.setUserName(dto.getUsername());
        User.setPassword(dto.getPassword());
        return User;
    }
}