package com.lewis.user.impl;

import com.lewis.dao.local.PayCostMapper;
import com.lewis.domain.entity.PayCost;
import com.lewis.domain.entity.UserInfo;
import com.lewis.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangminghua
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private PayCostMapper payCostMapper;

    @Override
    public List<UserInfo> list() {
        List<UserInfo> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            list.add(new UserInfo(i,"name_"+i,"hobby_"+i));
        }

        return list;
    }

    @Override
    public List<PayCost> payCosts() {
        return payCostMapper.list();
    }
}
