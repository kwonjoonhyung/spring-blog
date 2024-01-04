package com.kwonjh0406.blog.test;

import com.kwonjh0406.blog.model.RoleType;
import com.kwonjh0406.blog.model.User;
import com.kwonjh0406.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/dummy/join")
    public String join(User user) {
        System.out.println("username : " + user.getUsername());
        System.out.println("username : " + user.getPassword());
        System.out.println("username : " + user.getEmail());
        user.setRole(RoleType.USER);
        userRepository.save(user);

        return "회원가입이 완료되었습니다.";
    }
}
