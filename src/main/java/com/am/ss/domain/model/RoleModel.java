package com.am.ss.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by w on 2/6/17.
 */
@Entity
@Table(name = "role")
public class RoleModel extends BaseModel {

    @Column(name="role_name", nullable=false)
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }

}
