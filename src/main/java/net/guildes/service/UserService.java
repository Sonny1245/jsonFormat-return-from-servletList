package net.guildes.service;

import java.util.Arrays;
import java.util.List;

import net.guildes.model.User;

public class UserService {
	
	public List<User> getUsers(){
		return Arrays.asList(new User(100L, "Sonny", "Nguyen", "sonny95678@yahoo.com"),
				new User(101L, "Jay", "Luo", "jay@gmail.com"),
				new User(102L, "Austin", "White", "austin@google.com"));
	}

}
