package com.exercice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.demo.model.User;
import com.exercice.demo.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<User>> findAll() {;
		return new ResponseEntity<>(service.findAllUser(), HttpStatus.OK);
	}
    
}
