package com.example.contact_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired ContactRepo contactRepo;


	@GetMapping("/{userId}")
	public List<Contact> getUser(@PathVariable("userId") Long userId){

		return this.contactRepo.findByuid(userId);
	}
	@PostMapping("/add")
	@ResponseBody
	public Contact saveContact(@RequestBody Contact contact){
		
		return  this.contactRepo.save(contact);

	}
}
