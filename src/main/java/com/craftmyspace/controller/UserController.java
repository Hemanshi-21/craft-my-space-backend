package com.craftmyspace.controller;

import com.craftmyspace.dto.ResponseCodeJson;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.dto.UsersReq;
import com.craftmyspace.model.Users;
import com.craftmyspace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signup")
    public ResponseEntity<?> signUp(@RequestBody UsersReq usersReq) {
        ResponseCodeJson responseCodeJson = userService.signUp(usersReq);
        return new ResponseEntity<>(responseCodeJson, HttpStatus.valueOf(responseCodeJson.getCode()));
    }

    @PostMapping(value = "/signIn")
    public ResponseEntity<?> signIn(@RequestBody UsersReq usersReq) {
        UniversalResponse<Users> response = userService.signIn(usersReq);
        return new ResponseEntity<>(response,HttpStatus.valueOf(response.getResponseCodeJson().getCode()));
    }
}
