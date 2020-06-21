package com.springproject.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findaAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "11122222", "1234");
		return ResponseEntity.ok().body(u);
	}
}
