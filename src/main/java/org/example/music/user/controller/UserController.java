package org.example.music.user.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.music.user.controller.dto.request.UserCreateRequest;
import org.example.music.user.controller.dto.response.UserCreateResponse;
import org.example.music.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
@RequiredArgsConstructor // final 붙은 거 의존성 주입
@RestController
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public UserCreateResponse userCreate(@Valid @RequestBody UserCreateRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    public String hello() {
        return "hello world!";
    }

}
