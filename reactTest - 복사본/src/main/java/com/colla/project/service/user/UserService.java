package com.colla.project.service.user;

import com.colla.project.dto.UserDTO;
import com.colla.project.entity.User;

public interface UserService {

    void userInsert(UserDTO userDTO);

    default User dtoToEntity(UserDTO userDTO) {
        return User.builder()
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .build();
    }
}
