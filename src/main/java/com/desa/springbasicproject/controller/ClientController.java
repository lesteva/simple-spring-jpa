/**
 * 
 */
package com.desa.springbasicproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desa.springbasicproject.model.Client;
import com.desa.springbasicproject.service.ClientService;

/**
 * @author jlopeze
 *
 */
@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping
	public List<Client> getAll() {
		
		return clientService.getAll();
	}

}
