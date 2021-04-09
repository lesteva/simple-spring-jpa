/**
 * 
 */
package com.desa.springbasicproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desa.springbasicproject.model.Client;

/**
 * @author jlopeze
 *
 */
@RestController
@RequestMapping("/client")
public class ClientController {
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping
	public List<Client> getAll() {
		
		List<Client> lstClients = new ArrayList<Client>();
		lstClients.add(new Client(1, "Julio César", "LE", 31));
		lstClients.add(new Client(2, "Julio", "López", 34));
		lstClients.add(new Client(3, "JC", "LE", 32));
		
		return lstClients;
	}

}
