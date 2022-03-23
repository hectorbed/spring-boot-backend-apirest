package com.hectorbed.springboot.backend.apirest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hectorbed.springboot.backend.apirest.models.dao.IClientDao;
import com.hectorbed.springboot.backend.apirest.models.entity.Client;

@Service
public class ClientService implements IClientService{
	
	@Autowired
	private IClientDao clientDao;

	@Override
	public void save(Client client) {
		clientDao.save(client);
		
	}

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	public Client findById(Long id) {
		return clientDao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		clientDao.deleteById(id);
	}
	
	
	
}
