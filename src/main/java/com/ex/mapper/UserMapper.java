package com.ex.mapper;

import java.util.List;

import com.ex.model.User;

public interface UserMapper {

	List<User> findAllUsers();

	User findByKey(String userId, String userName);
	
}
