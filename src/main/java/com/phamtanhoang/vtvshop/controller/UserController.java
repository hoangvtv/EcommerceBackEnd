package com.phamtanhoang.vtvshop.controller;


import com.phamtanhoang.vtvshop.dto.ResponseDto;
import com.phamtanhoang.vtvshop.dto.user.SignInDto;
import com.phamtanhoang.vtvshop.dto.user.SignInReponseDto;
import com.phamtanhoang.vtvshop.dto.user.SignupDto;
import com.phamtanhoang.vtvshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }


}