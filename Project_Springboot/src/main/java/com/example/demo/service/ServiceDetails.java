package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.EntityDetails;

@Service
public interface ServiceDetails {
	
	EntityDetails get_details(int sid);
	
	EntityDetails post_details(EntityDetails post);
	
	EntityDetails update_details(EntityDetails update);
	
	String delete_details(int sid);
	

	
	
}
