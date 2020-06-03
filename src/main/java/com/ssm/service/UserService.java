package com.ssm.service;

import com.ssm.model.User;

public interface UserService {

    User getUserById(Long userId);

    User getUserByName(String name);
}
