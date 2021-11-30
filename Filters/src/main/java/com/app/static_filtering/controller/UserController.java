package com.app.static_filtering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.static_filtering.dao.UserRepository;
import com.app.static_filtering.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return repo.findUsers();
	}

}
