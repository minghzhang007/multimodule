package com.lewis.user;

import com.lewis.domain.entity.PayCost;
import com.lewis.domain.entity.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> list();

    List<PayCost> payCosts();
}
