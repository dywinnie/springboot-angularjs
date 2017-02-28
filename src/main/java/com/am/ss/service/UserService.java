package com.am.ss.service;

import com.am.ss.domain.model.UserModel;

import java.util.List;

/**
 * Created by w on 2/6/17.
 */
public interface UserService {

    List<UserModel> findAllUsers();

    void saveUser(UserModel user);

}
