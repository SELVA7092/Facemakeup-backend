package com.example.facemakup_backend.repository;

import com.example.facemakup_backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface Repository extends JpaRepository<Users,Integer>{



}
