package net.javacrud.springboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import net.javacrud.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import net.javacrud.springboot.dto.UserRegistrationDto;
import net.javacrud.springboot.model.Role;
import net.javacrud.springboot.model.User;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;

	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword());
		
		return userRepository.save(user);
	}
}
