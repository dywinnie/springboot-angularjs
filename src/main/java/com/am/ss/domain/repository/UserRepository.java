package com.am.ss.domain.repository;

import com.am.ss.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by w on 2/6/17.
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
