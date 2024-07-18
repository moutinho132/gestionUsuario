package com.dev.gestionusuario.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserEntity {
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
}
