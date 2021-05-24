package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//return all users
	public List<Order> findAll(){
		return repository.findAll();
		}
	
	//returns a user
	public Order findByid(Long id) {
		Optional<Order> obj =repository.findById(id);
		
		return obj.get();
	}

}
