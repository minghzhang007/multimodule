package com.lewis.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangminghua
 */
@Data
@NoArgsConstructor
public class UserInfo {
    private Integer id;

    private String name;

    private String hobby;

    public UserInfo(Integer id, String name, String hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }
}
