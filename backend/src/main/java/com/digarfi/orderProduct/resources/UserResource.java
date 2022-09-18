package com.digarfi.orderProduct.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digarfi.orderProduct.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User>findAll(){
		User u = new User(1L,"Maria de Oliveria", "maria@gmail.com", "11984678765","12345" );
		return ResponseEntity.ok().body(u);
	}
	
}
