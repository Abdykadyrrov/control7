package com.example.control7.repository;

import com.example.control7.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByEmail(String email);
}
