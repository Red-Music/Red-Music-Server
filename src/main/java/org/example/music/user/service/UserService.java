package org.example.music.user.service;

import lombok.RequiredArgsConstructor;
import org.example.music.user.controller.dto.request.UserCreateRequest;
import org.example.music.user.controller.dto.response.UserCreateResponse;
import org.example.music.user.domain.User;
import org.example.music.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserCreateResponse createUser(UserCreateRequest request) {
        User user = User.builder()
                .userId(request.getUserId())
                .password(request.getPassword())
                .build();

        User userEntity = userRepository.save(user);

        return new UserCreateResponse(userEntity.getId());
    }
}
