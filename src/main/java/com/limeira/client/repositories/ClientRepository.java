package com.limeira.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.limeira.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
