/**
 * 
 */
package com.desa.springbasicproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desa.springbasicproject.model.Client;
import com.desa.springbasicproject.service.ClientService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jlopeze
 *
 */
@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private ClientService clientService;
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping
	public List<Client> getAll() {
		LOGGER.info("Entra al service getAll");
		return clientService.getAll();
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping("/{id}")
	public Client getById(@PathVariable Integer id) {
		LOGGER.info("Entra al service getById: {}", id );

		return clientService.getById(id);
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@PostMapping
	public void save(@RequestBody Client t) {
		LOGGER.info("Entra al service save: {}", t );
		clientService.save(t);	
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@PutMapping
	public void update(@RequestBody Client t) {
		LOGGER.info("Entra al service update: {}", t );

		clientService.update(t);	
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		LOGGER.info("Entra al service delete: {}", id );

		clientService.delete(id);
	}

}
