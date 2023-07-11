package net.javacrud.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javacrud.springboot.dto.UserRegistrationDto;
import net.javacrud.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
