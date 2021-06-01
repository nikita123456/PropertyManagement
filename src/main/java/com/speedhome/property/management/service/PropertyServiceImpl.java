package com.speedhome.property.management.service;

import java.util.List;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.speedhome.property.management.model.property.PropertyMaster;
import com.speedhome.property.management.model.property.PropertyRequestModel;
import com.speedhome.property.management.model.user.UserMaster;
import com.speedhome.property.management.model.user.UserModel;
import com.speedhome.property.management.repository.PropertyMasterRepository;
import com.speedhome.property.management.repository.UserMasterRepository;

import net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.ForEmulatedAttachment;

@Component
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyMasterRepository propertyMasterRepository;
	
	@Autowired
	UserMasterRepository userMasterRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(PropertyServiceImpl.class);
	
	@Override
	public List<PropertyMaster> getProperties() throws Exception {
		LOGGER.info("=========================== PropertyServiceImpl -> getProperties() starts ===========================");
		List<PropertyMaster> propertyMasterList = propertyMasterRepository.findAll();
		
		for(PropertyMaster propertyMaster : propertyMasterList) {
			UserMaster userMaster = userMasterRepository.findByUserId(propertyMaster.getUserId());
			UserModel userModel = new UserModel();
			userModel.setUserId(userMaster.getUserId());
			userModel.setFirstName(userMaster.getFirstName());
			userModel.setMiddleName(userMaster.getMiddleName());
			userModel.setLastName(userMaster.getLastName());
			userModel.setEmail(userMaster.getEmail());
			userModel.setMobile(userMaster.getMobile());
			propertyMaster.setUser(userModel);
		}
		
		LOGGER.info("=========================== PropertyServiceImpl -> getProperties() end ===========================");
		return propertyMasterList ;
	}
	
	@Override
	public List<PropertyMaster> getPropertiesByFilterParams(PropertyRequestModel propertyFilters) throws Exception {
		LOGGER.info("=========================== PropertyServiceImpl -> getPropertiesByFilterParams() starts ===========================");
		List<PropertyMaster> propertyMasterList = propertyMasterRepository.getPropertiesByFilterParams(
				propertyFilters.getPropertyId(),	
				propertyFilters.getUserId(),
				propertyFilters.getConstructionType(),
				propertyFilters.getFloorNo(),
				propertyFilters.getFurnishingStatus(),
				propertyFilters.getLandmark(),
				propertyFilters.getNoOfBathrooms(),
				propertyFilters.getNoOfBedrooms(),
				propertyFilters.getNoOfCarParkings(),
				propertyFilters.getPropertyApprovalStatus(),
				propertyFilters.getPropertyBookingStatus(),
				propertyFilters.getPropertyBuiltupArea(),
				propertyFilters.getPropertyLocality(),
				propertyFilters.getPropertyType(),
				propertyFilters.getPrice()
				);
		
		for(PropertyMaster propertyMaster : propertyMasterList) {
			UserMaster userMaster = userMasterRepository.findByUserId(propertyMaster.getUserId());
			UserModel userModel = new UserModel();
			userModel.setUserId(userMaster.getUserId());
			userModel.setFirstName(userMaster.getFirstName());
			userModel.setMiddleName(userMaster.getMiddleName());
			userModel.setLastName(userMaster.getLastName());
			userModel.setEmail(userMaster.getEmail());
			userModel.setMobile(userMaster.getMobile());
			propertyMaster.setUser(userModel);
		}
		
		LOGGER.info("=========================== PropertyServiceImpl -> getPropertiesByFilterParams() end ===========================");
		return propertyMasterList ;
	}

	@Override
	public PropertyMaster addProperty(PropertyMaster newProperty) throws Exception {
		LOGGER.info("=========================== PropertyServiceImpl -> addProperty() starts ===========================");
		newProperty.setCreateDate(new Date());
		newProperty.setCreateBy(newProperty.getUserId().toString());
		PropertyMaster propertyMaster = propertyMasterRepository.save(newProperty);
		UserMaster userMaster = userMasterRepository.findByUserId(propertyMaster.getUserId());
		UserModel userModel = new UserModel();
		userModel.setUserId(userMaster.getUserId());
		userModel.setFirstName(userMaster.getFirstName());
		userModel.setMiddleName(userMaster.getMiddleName());
		userModel.setLastName(userMaster.getLastName());
		userModel.setEmail(userMaster.getEmail());
		userModel.setMobile(userMaster.getMobile());
		propertyMaster.setUser(userModel);
		
		LOGGER.info("=========================== PropertyServiceImpl -> addProperty() end ===========================");
		return propertyMaster;
	}
	
	@Override
	public PropertyMaster updateProperty(PropertyMaster newProperty) throws Exception {
		LOGGER.info("=========================== PropertyServiceImpl -> updateProperty() ===========================");
		newProperty.setCreateDate(new Date());
		newProperty.setCreateBy(newProperty.getUserId().toString());
		PropertyMaster propertyMaster = propertyMasterRepository.save(newProperty);
		UserMaster userMaster = userMasterRepository.findByUserId(propertyMaster.getUserId());
		UserModel userModel = new UserModel();
		userModel.setUserId(userMaster.getUserId());
		userModel.setFirstName(userMaster.getFirstName());
		userModel.setMiddleName(userMaster.getMiddleName());
		userModel.setLastName(userMaster.getLastName());
		userModel.setEmail(userMaster.getEmail());
		userModel.setMobile(userMaster.getMobile());
		propertyMaster.setUser(userModel);
		
		LOGGER.info("=========================== PropertyServiceImpl -> updateProperty() end ===========================");
		return propertyMaster;
	}

	@Override
	public void deleteProperty(Long propertyId) throws Exception {
		LOGGER.info("=========================== PropertyServiceImpl -> deleteProperty() ===========================");
		
		propertyMasterRepository.deleteById(propertyId);
		LOGGER.info("=========================== PropertyServiceImpl -> deleteProperty() end ===========================");
	}
}
