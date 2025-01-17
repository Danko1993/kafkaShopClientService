package com.daniel.kosk.microservices.clientservice.repository;

import com.daniel.kosk.microservices.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    boolean existsByEmail(String email);
    Client findByEmail(String email);
}
