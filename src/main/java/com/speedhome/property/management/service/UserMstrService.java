package com.speedhome.property.management.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.speedhome.property.management.model.user.UserMaster;

@Service
public interface UserMstrService extends UserDetailsService {
	UserMaster getUserDetailsByUsername(String username) throws Exception;
}