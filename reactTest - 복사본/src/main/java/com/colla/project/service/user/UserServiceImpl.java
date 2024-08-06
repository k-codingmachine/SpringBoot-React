package com.colla.project.service.user;

import com.colla.project.dto.UserDTO;
import com.colla.project.entity.User;
import com.colla.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void userInsert(UserDTO userDTO) {
        User user = dtoToEntity(userDTO);

        userRepository.save(user);
    }
}