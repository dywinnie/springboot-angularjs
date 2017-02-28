package com.accenture.sensis.domain.repository;

import com.accenture.sensis.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wdy on 2/6/17.
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
