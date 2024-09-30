package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EntityDetails;
import com.example.demo.service.ServiceDetails;

@RestController
public class ControllerGP {

	@Autowired
	ServiceDetails serve;

	@GetMapping(value = "/get/{sid}")
	public EntityDetails getmap(@PathVariable int sid) {
		EntityDetails done = serve.get_details(sid);
		return done;

	}

	@PostMapping(value = "/create")
	public ResponseEntity<EntityDetails> postmap(@RequestBody EntityDetails post) {
		EntityDetails post_details = serve.post_details(post);
		return new ResponseEntity<EntityDetails>(post_details, HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public EntityDetails updatemap(@RequestBody EntityDetails update) {
		EntityDetails done = serve.update_details(update);
		return done;

	}

	@DeleteMapping(value = "delete/{sid}")
	public String deletemap(@PathVariable int sid) {
		String done = serve.delete_details(sid);
		return done;

	}

}
