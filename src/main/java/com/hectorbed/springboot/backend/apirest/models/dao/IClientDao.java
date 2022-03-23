package com.hectorbed.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hectorbed.springboot.backend.apirest.models.entity.Client;

public interface IClientDao extends CrudRepository<Client, Long> {

}
