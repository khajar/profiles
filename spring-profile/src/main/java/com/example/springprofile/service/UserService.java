package com.example.springprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springprofile.model.User;
import com.example.springprofile.repository.UserRepository;

//@Profile(value= {"test","dev"})
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
