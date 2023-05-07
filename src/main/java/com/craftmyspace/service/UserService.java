package com.craftmyspace.service;

import com.craftmyspace.dto.ResponseCodeJson;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.dto.UsersReq;
import com.craftmyspace.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    ResponseCodeJson signUp(UsersReq usersReq);

    UniversalResponse<Users> signIn(UsersReq usersReq);
}
