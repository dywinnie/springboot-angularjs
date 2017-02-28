package com.am.ss.service.impl;

import com.am.ss.domain.model.UserModel;
import com.am.ss.domain.repository.UserRepository;
import com.am.ss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by w on 2/6/17.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    private final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired(required = true)
    private UserRepository userRepository;

    @Override
    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(UserModel user) {
        userRepository.save(user);
    }

}
