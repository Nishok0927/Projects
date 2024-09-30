package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EntityDetails;

@Repository
public interface RepoDetails extends JpaRepository<EntityDetails, Integer>{

}
