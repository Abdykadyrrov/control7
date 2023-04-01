package com.example.control7.controller;

import com.example.control7.dto.ClientDto;
import com.example.control7.entity.Client;
import com.example.control7.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/registration")
    public ResponseEntity<ClientDto> register(@RequestBody ClientDto clientDto){
        Client client = clientService.createUser(clientDto.getName(), clientDto.getEmail());
        return ResponseEntity.ok(ClientDto.from(client));
    }
}
