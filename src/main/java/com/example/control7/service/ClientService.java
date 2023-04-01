package com.example.control7.service;

import com.example.control7.entity.Client;
import com.example.control7.repository.ClientRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService implements UserDetailsService {
    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(ClientRepository clientRepository, PasswordEncoder passwordEncoder) {
        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public Client createUser(String name, String email,String password) throws IllegalStateException {
        Optional<Client> existingUser = clientRepository.findByEmail(email);
        if (existingUser.isPresent()) {
            throw new IllegalStateException("User with email " + email + " already exists.");
        }
        return clientRepository.save(new Client(name,email,passwordEncoder.encode(password)));
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Client> optUser = clientRepository.findByEmail(email);
        if(optUser.isEmpty()){
            throw new UsernameNotFoundException("Not found");
        }
        return optUser.get();
    }

}
