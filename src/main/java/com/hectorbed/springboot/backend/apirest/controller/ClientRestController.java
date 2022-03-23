package com.hectorbed.springboot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hectorbed.springboot.backend.apirest.models.entity.Client;
import com.hectorbed.springboot.backend.apirest.service.IClientService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	@Autowired
	private IClientService service;
	
	@GetMapping(path = "/clients")
	public List<Client> index() {
		return service.findAll();
	}
	
	@GetMapping(path = "/clients/{id}")
	public Client findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping(path = "/clients/new")
	public void add(@RequestBody Client client) {
		service.save(client);
	}
	
	@GetMapping(path = "/clients/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
