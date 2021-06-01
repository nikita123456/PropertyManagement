package com.speedhome.property.management.service;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.speedhome.property.management.model.user.UserMaster;
import com.speedhome.property.management.repository.UserMasterRepository;

@Component
public class UserMstrServiceImpl implements UserMstrService {
	
	@Autowired
	private UserMasterRepository userMstrRepo;
	
	private static final Logger LOGGER = LogManager.getLogger(UserMstrServiceImpl.class);
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LOGGER.info("=========================== UserMstrServiceImpl -> loadUserByUsername() starts ===========================");
		UserMaster user = userMstrRepo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		
		LOGGER.info("=========================== UserMstrServiceImpl -> loadUserByUsername() end ===========================");
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public UserMaster getUserDetailsByUsername(String username) throws Exception {
		
		LOGGER.info("=========================== UserMstrServiceImpl -> getUserDetailsByUsername() starts ===========================");
		UserMaster user = userMstrRepo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		
		LOGGER.info("=========================== UserMstrServiceImpl -> getUserDetailsByUsername() end ===========================");
		return user;
	}
}

