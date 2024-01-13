package com.falcon.ECommerce.dao;

import com.falcon.ECommerce.model.SignupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupDao extends JpaRepository<SignupUser, Integer>
{

}
