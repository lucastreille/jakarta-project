package com.exercice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.demo.model.User;
import com.exercice.demo.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
    
    private final UserRepository repository;

	@Autowired
	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public List<User> findAllUser() {
		return repository.findAllByDeletedAtNull();
	}
    
}
