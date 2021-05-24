package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	//return all users
	public List<Category> findAll(){
		return repository.findAll();
		}
	
	//returns a user
	public Category findByid(Long id) {
		Optional<Category> obj =repository.findById(id);
		
		return obj.get();
	}

}
