package com.example.control7.controller;

import com.example.control7.dto.ClientDto;
import com.example.control7.dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClientController {
    @PostMapping("/registration")
    public ResponseEntity<ClientDto> register(@RequestBody ClientDto clientDto){
        return null;
    }
}
