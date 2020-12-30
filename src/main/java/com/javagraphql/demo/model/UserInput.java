package com.javagraphql.demo.model;

import lombok.Data;


@Data
public class UserInput {
    private String username;
    private String password;

    private String name;
    private String email;
}
