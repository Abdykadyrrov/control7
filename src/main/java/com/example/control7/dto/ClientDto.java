package com.example.control7.dto;

import com.example.control7.entity.Client;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
    public static ClientDto from(Client client){
        return builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .build();
    }
    private Long id;
    private String name;
    private String email;
}
