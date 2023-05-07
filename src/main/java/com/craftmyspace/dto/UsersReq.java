package com.craftmyspace.dto;

import lombok.Data;

@Data
public class UsersReq {
    private String email;
    private String password;
    private String userName;
}
