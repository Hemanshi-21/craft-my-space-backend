package com.craftmyspace.service.impl;

import com.craftmyspace.dto.ResponseCodeJson;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.dto.UsersReq;
import com.craftmyspace.model.Users;
import com.craftmyspace.repository.UsersRepository;
import com.craftmyspace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public ResponseCodeJson signUp(UsersReq usersReq) {
        Users users = usersRepository.findByEmailAndIsDeleted(usersReq.getEmail(), 0);
        if (users != null) {
            return new ResponseCodeJson("User already exist with same email", HttpStatus.BAD_REQUEST.value());
        }
        users = new Users();
        users.setUserId(UUID.randomUUID().toString());
        users.setUserName(usersReq.getUserName());
        users.setEmail(usersReq.getEmail());
        users.setPassword(usersReq.getPassword().trim());
        users.setIsDeleted(0);
        usersRepository.save(users);
        return new ResponseCodeJson("success", 200);
    }

    @Override
    public UniversalResponse<Users> signIn(UsersReq usersReq) {
        UniversalResponse<Users> response = new UniversalResponse<>();
        Users users = usersRepository.findByEmailAndPasswordAndIsDeleted(usersReq.getEmail(), usersReq.getPassword(), 0);
        if (users != null) {
            response.setObject(users);
            response.setResponseCodeJson(new ResponseCodeJson(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK.value()));
        } else {
            response.setResponseCodeJson(new ResponseCodeJson("Combination of username and password mismatched!", HttpStatus.BAD_REQUEST.value()));
        }
        return response;
    }
}
