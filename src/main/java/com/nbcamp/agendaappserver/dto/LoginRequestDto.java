package com.nbcamp.agendaappserver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class LoginRequestDto {
    private String username;
    private String password;
}