package com.cassol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cassol.model.User;
import com.cassol.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.PUT)
	public Long put(User user){
		return userRepository.save(user).getId();
	}
	

}
