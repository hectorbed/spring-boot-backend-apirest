package com.hectorbed.springboot.backend.apirest.service;

import java.util.List;

import com.hectorbed.springboot.backend.apirest.models.entity.Client;

public interface IClientService {
	
	public void save(Client client);
	
	public List<Client> findAll();
	
	public Client findById(Long id);
	
	public void delete(Long id);

}
