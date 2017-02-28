package com.accenture.sensis.service;

import com.accenture.sensis.domain.model.UserModel;

import java.util.List;

/**
 * Created by wdy on 2/6/17.
 */
public interface UserService {

    List<UserModel> findAllUsers();

    void saveUser(UserModel user);

}
