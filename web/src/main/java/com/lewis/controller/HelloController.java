package com.lewis.controller;

import com.lewis.domain.entity.PayCost;
import com.lewis.domain.entity.UserInfo;
import com.lewis.hello.HelloService;
import com.lewis.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangminghua
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @Resource
    private UserService userService;

    @GetMapping("/say")
    public String sayHello(String name) {
        String s = helloService.sayHello(name);
        return s;
    }

    @GetMapping("/users")
    public List<UserInfo> userList(){
        List<UserInfo> list = userService.list();
        return list;
    }

    @GetMapping("/payCosts")
    public List<PayCost> payCosts(){
        return userService.payCosts();
    }
}
