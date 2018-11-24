package com.shift.fiap.ms.microserviceuser.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shift.fiap.ms.microserviceuser.model.User;
import com.shift.fiap.ms.microserviceuser.repository.Users;

@RestController
@RequestMapping("/users")
public class UsersResource {
	
	@Autowired
	private Users users;
	
	@PostMapping
	public User adicionar(@Valid @RequestBody User user) {
		return users.save(user);
	}
	
	@GetMapping
	public List<User> listar() {
		return users.findAll();
	}
	
}
