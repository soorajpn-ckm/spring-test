package com.sooraj.app.service;


import org.springframework.stereotype.Service;
import com.sooraj.app.model.User;
@Service
public interface UserService {
	
	public User register(User user);
	public User Login(User user);
	

}
