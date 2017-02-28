package com.accenture.sensis.service.impl;

import com.accenture.sensis.domain.model.UserModel;
import com.accenture.sensis.domain.repository.UserRepository;
import com.accenture.sensis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by wdy on 2/6/17.
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
