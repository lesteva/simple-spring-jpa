package com.desa.springbasicproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desa.springbasicproject.model.Client;
import com.desa.springbasicproject.repository.ClientRepository;
import com.desa.springbasicproject.service.ClientService;

@Service
@Transactional(readOnly = false )
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Client getById(Integer id) {
		return clientRepository.findById(id).orElse(new Client(0, "", "", 0));
	}

	@Override
	public void save(Client t) {
		clientRepository.save(t);
	}

	@Override
	public void update(Client t) {
		clientRepository.save(t);		
	}

	@Override
	public void delete(Integer id) {
		clientRepository.deleteById(id);	
	}

}
