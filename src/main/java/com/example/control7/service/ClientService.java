package com.example.control7.service;

import com.example.control7.entity.Client;
import com.example.control7.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public Client createUser(String name, String email) throws IllegalStateException {
        Optional<Client> existingUser = clientRepository.findByEmail(email);
        if (existingUser.isPresent()) {
            throw new IllegalStateException("User with email " + email + " already exists.");
        }
        return clientRepository.save(new Client(name,email));
    }
}
