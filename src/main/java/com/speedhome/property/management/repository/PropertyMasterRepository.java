package com.speedhome.property.management.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.speedhome.property.management.model.property.PropertyMaster;

@Repository
public interface PropertyMasterRepository extends JpaRepository<PropertyMaster, Long>{
	List<PropertyMaster> findAll();
	
	@Query(value = "SELECT * FROM tbl_property_master where (pm_id = :propertyId or :propertyId = 0) \r\n" + 
			"and (pm_um_id = :userId or :userId = 0) \r\n" + 
			"and (upper(pm_construction_type) like upper('%' || :constructionType || '%') or :constructionType = 'ALL') \r\n" + 
			"and (pm_floor_no <= :floorNo or :floorNo = 0) \r\n" + 
			"and (upper(pm_furnishing_status) like upper('%' || :furnishingStatus || '%') or :furnishingStatus = 'ALL') \r\n" + 
			"and (upper(pm_landmark) like upper('%' || :landmark || '%') or :landmark = 'ALL') \r\n" + 
			"and (pm_no_of_bathrooms <= :noOfBathrooms or :noOfBathrooms = 0) \r\n" + 
			"and (pm_no_of_bedrooms <= :noOfBedrooms or :noOfBedrooms = 0) \r\n" + 
			"and (pm_no_of_car_parkings <= :noOfCarParkings or :noOfCarParkings = 0) \r\n" + 
			"and (upper(pm_property_approval_status) like upper('%' || :propertyApprovalStatus || '%') or :propertyApprovalStatus = 'ALL') \r\n" + 
			"and (upper(pm_property_booking_status) like upper('%' || :propertyBookingStatus || '%') or :propertyBookingStatus = 'ALL') \r\n" + 
			"and (pm_property_builtup_area <= :propertyBuiltupArea or :propertyBuiltupArea = 0) \r\n" + 
			"and (upper(pm_property_locality) like upper('%' || :propertyLocality || '%') or :propertyLocality = 'ALL') \r\n" + 
			"and (upper(pm_property_type) like  upper('%' || :propertyType || '%') or :propertyType = 'ALL') \r\n" + 
			"and (pm_price <= :price or :price = 0)", nativeQuery=true)
	List<PropertyMaster> getPropertiesByFilterParams(
			@Param("propertyId") Long propertyId,	
			@Param("userId") Long userId,
			@Param("constructionType") String constructionType,
			@Param("floorNo") Long floorNo,
			@Param("furnishingStatus") String furnishingStatus,
			@Param("landmark") String landmark,
			@Param("noOfBathrooms") Long noOfBathrooms,
			@Param("noOfBedrooms") Long noOfBedrooms,
			@Param("noOfCarParkings") Long noOfCarParkings,
			@Param("propertyApprovalStatus") String propertyApprovalStatus,
			@Param("propertyBookingStatus") String propertyBookingStatus,
			@Param("propertyBuiltupArea") Long propertyBuiltupArea,
			@Param("propertyLocality") String propertyLocality,
			@Param("propertyType") String propertyType,
			@Param("price") Long price);
}
