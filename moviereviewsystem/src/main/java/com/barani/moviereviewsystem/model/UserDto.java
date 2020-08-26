/**
 * 
 */
package com.barani.moviereviewsystem.model;

import java.util.Set;

/**
 * @author baran
 *
 */
public class UserDto {

	private String username;
	
	private String password;
	
	private Set<Role> userRoles;
	

	/**
	 * @return the userRoles
	 */
	public Set<Role> getUserRoles() {
		return userRoles;
	}

	/**
	 * @param userRoles the userRoles to set
	 */
	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
