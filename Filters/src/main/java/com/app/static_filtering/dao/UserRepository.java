package com.app.static_filtering.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.static_filtering.model.User;

@Component
public class UserRepository {
	private static List<User> userList = new ArrayList<>();

	static {
		userList.add(new User("Harry", "STYLES", "32145", 27));
		userList.add(new User("Louis", "TOMLINSON", "32145", 30));
		userList.add(new User("Niall", "HORAN", "32145", 28));
	}

	public List<User> findUsers() {
		return userList;
	}
}
