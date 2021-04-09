/**
 * 
 */
package com.desa.springbasicproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desa.springbasicproject.model.Client;

/**
 * @author jlopeze
 *
 */
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
