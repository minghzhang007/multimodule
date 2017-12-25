package com.lewis.user.impl;

import com.lewis.domain.entity.UserInfo;
import com.lewis.user.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangminghua
 */
@Service
public class UserServiceImpl implements UserService{


    @Override
    public List<UserInfo> list() {
        List<UserInfo> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            list.add(new UserInfo(i,"name_"+i,"hobby_"+i));
        }

        return list;
    }
}
