package com.am.ss.controller;

import com.am.ss.domain.model.UserModel;
import com.am.ss.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by w on 2/6/17.
 */
@RestController
@RequestMapping("/api")
@WebAppConfiguration
public class UserRestApiController {

    public static final Logger logger = LoggerFactory.getLogger(UserRestApiController.class);

    @Autowired
    @Qualifier("userService")
    @Lazy
    private UserService userService;

    @RequestMapping(value = "/users/", method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> listAllUsers() {
        List<UserModel> users = userService.findAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<UserModel>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserModel user) {
        logger.info("Creating User : {}", user);
        userService.saveUser(user);
        return new ResponseEntity<UserModel>(user, HttpStatus.OK);
    }

}
