package com.speedhome.property.management.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speedhome.property.management.model.JwtRequestModel;
import com.speedhome.property.management.model.JwtResponseModel;
import com.speedhome.property.management.model.user.UserMaster;
import com.speedhome.property.management.service.UserMstrServiceImpl;
import com.speedhome.property.management.util.JwtUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/propertyManagement")
public class LoginController {

	@Autowired
	private AuthenticationManager authManager;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserMstrServiceImpl userService;
	
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

	@ApiOperation("This endpoint validates username and password and returns json web token with session if the username and password is valid.")
	@GetMapping(value = "/authenticate", consumes = "application/json")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestModel authRequest, HttpServletRequest request) throws Exception {
		LOGGER.info("=========================== LoginController -> createAuthenticationToken() starts ===========================");
		
		authenticate(authRequest.getUsername(), authRequest.getPassword());
		final UserDetails userDetails = userService.loadUserByUsername(authRequest.getUsername());
		
		UserMaster userMstr = userService.getUserDetailsByUsername(authRequest.getUsername());
		
		if(!"A".equalsIgnoreCase(userMstr.getActive())) {
			
			LOGGER.info("=========================== LoginController -> createAuthenticationToken() end ===========================");
			return ResponseEntity.ok("user_is_not_active");
			
		}
		
		final String token = jwtUtil.generateToken(userDetails);
		
		LOGGER.info("=========================== LoginController -> createAuthenticationToken() end ===========================");
		return ResponseEntity.ok(new JwtResponseModel(token));
	}

	private void authenticate(String username, String password) throws Exception {
		
		LOGGER.info("=========================== LoginController -> authenticate() starts ===========================");
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
		} catch (DisabledException e) {
			
			LOGGER.info("=========================== LoginController -> authenticate() DisabledException ===========================");
			e.printStackTrace();
			throw new Exception("user_disabled", e);
			
		} catch (BadCredentialsException e) {
			
			LOGGER.info("=========================== LoginController -> authenticate() BadCredentialsException ===========================");
			e.printStackTrace();
			throw new Exception("invalid_credentials", e);
			
		}
		
		LOGGER.info("=========================== LoginController -> authenticate() starts ===========================");
	}
	
}
