package com.colla.project.contoller;

import com.colla.project.dto.UserDTO;
import com.colla.project.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/insert")
    public String insert(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        userService.userInsert(userDTO);

        return "success";
    }
}
