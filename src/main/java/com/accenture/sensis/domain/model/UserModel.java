package com.accenture.sensis.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wdy on 2/6/17.
 */
@Entity
@Table(name = "user")
public class UserModel extends BaseModel {

    @Column(name="user_name", nullable=false)
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

}
