package com.am.ss.controller;

import com.am.ss.domain.model.RoleModel;
import com.am.ss.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by w on 2/6/17.
 */
@RestController
@RequestMapping("/api")
public class RoleRestApiController {

    public static final Logger logger = LoggerFactory.getLogger(RoleRestApiController.class);

    @Autowired
    @Lazy
    @Qualifier("roleService")
    private RoleService roleService;

    @RequestMapping(value = "/roles/", method = RequestMethod.GET)
    public ResponseEntity<List<RoleModel>> listAllRoles() {
        List<RoleModel> roles = roleService.findAllRoles();
        if (roles.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<RoleModel>>(roles, HttpStatus.OK);
    }

}
