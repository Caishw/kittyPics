package com.github.kittypics.controller;

import com.github.kittypics.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aishu on 6/05/2017.
 */
@RestController
public class SignUpController {

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void signUp(UserDTO userDTO) {
        System.out.println("User sign up request recieved with the following details");
        System.out.println(userDTO.toString());
    }
}
