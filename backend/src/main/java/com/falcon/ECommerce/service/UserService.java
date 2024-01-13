package com.falcon.ECommerce.service;

import com.falcon.ECommerce.dao.LoginDao;
import com.falcon.ECommerce.dao.SignupDao;
import com.falcon.ECommerce.model.SignupUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService
{
    @Autowired
    SignupDao signupDao;
    @Autowired
    LoginDao loginDao;
    public ResponseEntity<String> addUser(SignupUser signupUser) {
        try {
            signupDao.save(signupUser);
            return new ResponseEntity<>("Added", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Problem Occurred", HttpStatus.BAD_REQUEST);
        }
    }


}
