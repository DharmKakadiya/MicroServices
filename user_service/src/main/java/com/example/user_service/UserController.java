package com.example.user_service;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
	private final UserRepo userRepo;
	private final RestTemplate restTemplate;

	public UserController(UserRepo userRepo, RestTemplate restTemplate) {
		this.userRepo = userRepo;
		this.restTemplate = restTemplate;
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") int userId){

		Optional<User> optionalUser =  this.userRepo.findById(userId);

		User userWithoutContact = optionalUser.get();

		List<Contact> externalContact = this.restTemplate.getForObject("http://contact-service/contact/" + userId, List.class);

		userWithoutContact.setContact(externalContact);

		System.out.println("hello world   ::::   " + userWithoutContact.getName());

		return userWithoutContact;

	}

	@PostMapping("/add")
	@ResponseBody
	public User savedata(@RequestBody User user){

		return  this.userRepo.save(user);
	}

}
