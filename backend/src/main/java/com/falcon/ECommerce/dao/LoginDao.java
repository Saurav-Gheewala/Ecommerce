package com.falcon.ECommerce.dao;

import com.falcon.ECommerce.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<LoginUser, Integer>
{

}
