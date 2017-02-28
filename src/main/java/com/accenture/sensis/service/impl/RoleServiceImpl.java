package com.accenture.sensis.service.impl;

import com.accenture.sensis.domain.model.RoleModel;
import com.accenture.sensis.domain.repository.RoleRepository;
import com.accenture.sensis.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by wdy on 2/6/17.
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

    private final Logger logger = Logger.getLogger(RoleServiceImpl.class.getName());

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleModel> findAllRoles() {
        return roleRepository.findAll();
    }

}
