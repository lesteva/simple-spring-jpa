/**
 * 
 */
package com.desa.springbasicproject.service;

import java.util.List;

import com.desa.springbasicproject.model.Client;

/**
 * @author jlopeze
 *
 */
public interface ClientService {

	public List<Client> getAll();
	
	public Client getById(Integer id);
	
	public void save(Client t);
	
	public void update(Client t);
	
	public void delete(Integer id);
	
}
