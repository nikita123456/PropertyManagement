package com.speedhome.property.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.speedhome.property.management.model.property.PropertyMaster;
import com.speedhome.property.management.model.property.PropertyRequestModel;

@Service
public interface PropertyService {
	List<PropertyMaster> getProperties() throws Exception;
	List<PropertyMaster> getPropertiesByFilterParams(PropertyRequestModel propertyFilters) throws Exception;
	PropertyMaster addProperty(PropertyMaster newProperty) throws Exception;
	PropertyMaster updateProperty(PropertyMaster newProperty) throws Exception;
	void deleteProperty(Long propertyId) throws Exception;
}
