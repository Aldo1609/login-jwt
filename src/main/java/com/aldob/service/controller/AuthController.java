package com.aldob.service.controller;

import com.aldob.service.dto.AuthResponse;
import com.aldob.service.dto.LoginRequest;
import com.aldob.service.dto.RegisterRequest;
import com.aldob.service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {


    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody LoginRequest loginRequest) {

        return ResponseEntity.ok(authService.login(loginRequest));

    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) {

        return ResponseEntity.ok(authService.register(registerRequest));

    }



}