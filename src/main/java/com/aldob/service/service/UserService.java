package com.aldob.service.service;

import com.aldob.service.dto.UserDTO;
import com.aldob.service.dto.UserRequest;
import com.aldob.service.dto.UserResponse;
import com.aldob.service.entity.User;
import com.aldob.service.enums.Role;
import com.aldob.service.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponse updateUser(UserRequest userRequest) {

        User user = User.builder()
                .id(userRequest.getId())
                .firstname(userRequest.getFirstname())
                .lastname(userRequest.getLastname())
                .country(userRequest.getCountry())
                .role(Role.USER)
                .build();

        userRepository.updateUser(user.getId(), user.getFirstname(), user.getLastname(), user.getCountry());

        return new UserResponse("El usuario se registró satisfactoriamente");
    }

    public UserDTO getUser(Integer id) {
        User user= userRepository.findById(id).orElse(null);

        if (user!=null)
        {
            UserDTO userDTO = UserDTO.builder()
                    .id(user.getId())
                    .username(user.getUsername())
                    .firstname(user.getFirstname())
                    .lastname(user.getLastname())
                    .country(user.getCountry())
                    .build();
            return userDTO;
        }
        return null;
    }
}
