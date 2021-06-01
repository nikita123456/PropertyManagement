package com.speedhome.property.management.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speedhome.property.management.model.JwtRequestModel;
import com.speedhome.property.management.model.JwtResponseModel;
import com.speedhome.property.management.model.property.PropertyMaster;
import com.speedhome.property.management.model.property.PropertyRequestModel;
import com.speedhome.property.management.model.user.UserMaster;
import com.speedhome.property.management.service.PropertyService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/propertyManagement")
public class PropertyController {

	private static final Logger LOGGER = LogManager.getLogger(PropertyController.class);
	
	@Autowired
	PropertyService propertyService;

	@ApiOperation("This endpoint will fetch all propeties from database")
	@GetMapping(value = "/getProperties", consumes = "application/json")
	public ResponseEntity<?> getProperties()  {
		LOGGER.info("=========================== PropertyController -> getProperties() starts ===========================");
		List<PropertyMaster> propertyList = null;
		try {
			
			propertyList = propertyService.getProperties();
		} catch (Exception e) {
			LOGGER.info("=========================== PropertyController -> getProperties() Exception ===========================");
			e.printStackTrace();
		}
		
		LOGGER.info("=========================== PropertyController -> getProperties() end ===========================");
		return ResponseEntity.ok(propertyList);
	}
	
	@ApiOperation("This endpoint will fetch filtered propeties from database based on given filter parameters")
	@GetMapping(value = "/getPropertiesByFilterParams", consumes = "application/json")
	public ResponseEntity<?> getPropertiesByFilterParams(@RequestBody PropertyRequestModel propertyFilterParams)  {
		LOGGER.info("=========================== PropertyController -> getPropertiesByFilterParams() starts ===========================");
		List<PropertyMaster> propertyList = null;
		try {
			
			propertyList = propertyService.getPropertiesByFilterParams(propertyFilterParams);
		} catch (Exception e) {
			LOGGER.info("=========================== PropertyController -> getPropertiesByFilterParams() Exception ===========================");
			e.printStackTrace();
		}
		
		LOGGER.info("=========================== PropertyController -> getPropertiesByFilterParams() end ===========================");
		return ResponseEntity.ok(propertyList);
	}
	
	@ApiOperation("This endpoint will add property in database")
	@PostMapping(value = "/addProperty", consumes = "application/json")
	public ResponseEntity<?> addProperty(@RequestBody PropertyMaster newProperty)  {
		LOGGER.info("=========================== PropertyController -> addProperty() starts ===========================");
		PropertyMaster property = null;
		try {
			
			property = propertyService.addProperty(newProperty);
		} catch (Exception e) {
			LOGGER.info("=========================== PropertyController -> addProperty() Exception ===========================");
			e.printStackTrace();
		}
		
		LOGGER.info("=========================== PropertyController -> addProperty() end ===========================");
		return ResponseEntity.ok(property);
	}
	
	@ApiOperation("This endpoint will update property in database")
	@PutMapping(value = "/updateProperty", consumes = "application/json")
	public ResponseEntity<?> updateProperty(@RequestBody PropertyMaster newProperty)  {
		LOGGER.info("=========================== PropertyController -> updateProperty() starts ===========================");
		PropertyMaster property = null;
		try {
			
			property = propertyService.updateProperty(newProperty);
		} catch (Exception e) {
			LOGGER.info("=========================== PropertyController -> updateProperty() Exception ===========================");
			e.printStackTrace();
		}
		
		LOGGER.info("=========================== PropertyController -> updateProperty() end ===========================");
		return ResponseEntity.ok(property);
	}
	
	@ApiOperation("This endpoint will delete property from database")
	@DeleteMapping(value = "/deleteProperty/{propertyId}", consumes = "application/json")
	public ResponseEntity<?> deleteProperty(@PathVariable Long propertyId)  {
		LOGGER.info("=========================== PropertyController -> deleteProperty() starts ===========================");
		PropertyMaster property = null;
		try {
			
			propertyService.deleteProperty(propertyId);
		} catch (Exception e) {
			LOGGER.info("=========================== PropertyController -> deleteProperty() Exception ===========================");
			e.printStackTrace();
			return ResponseEntity.ok("Record deletion failed");
		}
		
		LOGGER.info("=========================== PropertyController -> deleteProperty() end ===========================");
		return ResponseEntity.ok("Record deleted successfully");
	}
}
