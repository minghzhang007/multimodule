package com.lewis.hello.impl;

import com.lewis.hello.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhangminghua
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hi ," + name + ", Nice to meet you !";
    }
}
