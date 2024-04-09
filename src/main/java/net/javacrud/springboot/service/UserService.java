package net.javacrud.springboot.service;



import net.javacrud.springboot.dto.UserRegistrationDto;
import net.javacrud.springboot.model.User;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
