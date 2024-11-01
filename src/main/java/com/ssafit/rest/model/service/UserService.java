package com.ssafit.rest.model.service;

import com.ssafit.rest.model.dto.User;

public interface UserService {
	 public boolean signup(User user);
	 public User login(String id, String password);
	 public boolean delete(int id);
	 public boolean isUserExist(String userId);

}