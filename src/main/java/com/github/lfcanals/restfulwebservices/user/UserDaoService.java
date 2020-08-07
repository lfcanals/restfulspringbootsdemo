package com.github.lfcanals.restfulwebservices.user;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static Map<Integer, User> users = new HashMap<>();

	private static int usersCount = 3;

	static {
		users.put(1, new User(1, "Adam", new Date()));
		users.put(2, new User(2, "Eve", new Date()));
		users.put(3, new User(3, "Jack", new Date()));
	}

	public Collection<User> findAll() {
    return users.values();
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.put(user.getId(), user);
		return user;
	}

	public User findOne(int id) {
		return users.get(id);
	}

	public User deleteById(int id) {
		return users.remove(id);
	}
}
