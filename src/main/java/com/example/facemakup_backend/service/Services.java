package com.example.facemakup_backend.service;

import com.example.facemakup_backend.models.Login;
import com.example.facemakup_backend.models.Users;
import com.example.facemakup_backend.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Services {
    @Autowired
    Repository repo;
    public String register(Users user){
        repo.save(user);
        return "REGISTERES";
    }
    public String logins(Login logs)
    {

        return "";
    }

}
