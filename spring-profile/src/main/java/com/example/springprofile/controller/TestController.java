package com.example.springprofile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springprofile.model.User;
import com.example.springprofile.service.UserService;

@RestController
public class TestController {

	@Autowired
	private UserService repo;

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return repo.getUsers();
	}

}
