package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.EntityDetails;
import com.example.demo.repo.RepoDetails;
@Component
public class ServiceImp implements ServiceDetails{
	
	@Autowired
	RepoDetails repo;

	@Override
	public EntityDetails get_details(int sid) {
		Optional<EntityDetails> byId = repo.findById(sid);
		EntityDetails entityDetails = byId.get();	
		return entityDetails;
	}
	
	@Override
	public EntityDetails post_details(EntityDetails post) {
		
		return repo.save(post);
	}

	@Override
	public EntityDetails update_details(EntityDetails update) {  
		
		return repo.save(update);
	}

	@Override
	public String delete_details(int sid) {
		repo.deleteById(sid);
		return "Details deleted Succesfully";
	}


}
