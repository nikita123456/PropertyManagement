package com.speedhome.property.management.model.property;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.speedhome.property.management.model.user.UserModel;

@SuppressWarnings("serial")
@Entity
@Table(name="TBL_PROPERTY_MASTER")
public class PropertyMaster implements Serializable {

	public PropertyMaster() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROPERTY_MASTER")
	@SequenceGenerator(name = "SEQ_PROPERTY_MASTER", sequenceName = "SEQ_PROPERTY_MASTER")
	@Column(name="PM_ID")
	private Long propertyId;
	
	@Column(name="PM_UM_ID")
	private Long userId;
	
	@Transient
	private UserModel user;
	
	@Column(name="PM_PROPERTY_APPROVAL_STATUS")
	private String propertyApprovalStatus;
	
	//LEASE or SALE
	@Column(name="PM_PROPERTY_TYPE")
	private String propertyType;
	
	@Column(name="PM_PROPERTY_BOOKING_STATUS")
	private String propertyBookingStatus;
	
	//Under Construction or Ready
	@Column(name="PM_CONSTRUCTION_TYPE")
	private String constructionType;
	
	@Column(name="PM_POSSESSION_DATE")
	private Date possessionDate;
	
	@Column(name="PM_LISTING_DATE")
	private Date listingDate;
	
	@Column(name="PM_PRICE")
	private Long price;
	
	@Column(name="PM_PROPERTY_LOCALITY")
	private String propertyLocality;
	
	@Column(name="PM_LANDMARK")
	private String landmark;
	
	@Column(name="PM_PROPERTY_IMAGES_PATH")
	private String propertyImagesPath;
	
	@Column(name="PM_FLOOR_NO")
	private Long floorNo;
	
	//Builtup Area in SqFt
	@Column(name="PM_PROPERTY_BUILTUP_AREA")
	private Long propertyBuiltupArea;
	
	@Column(name="PM_FURNISHING_STATUS")
	private String furnishingStatus;
	
	@Column(name="PM_NO_OF_BEDROOMS")
	private Long noOfBedrooms;
	
	@Column(name="PM_NO_OF_BATHROOMS")
	private Long noOfBathrooms;
	
	@Column(name="PM_NO_OF_CAR_PARKINGS")
	private Long noOfCarParkings;
	
	@Column(name="PM_PROPERTY_DESCRIPTION")
	private String propertyDescription;
	
	@Column(name="PM_PROPERTY_ACCESSIBILITY")
	private String propertyAccessbility;
	
	@JsonIgnore
	@Column(name="PM_CREATE_DATE")
	private Date createDate;
	
	@JsonIgnore
	@Column(name="PM_CREATE_BY")
	private String createBy;
	
	@JsonIgnore
	@Column(name="PM_LAST_UPDATE_DATE")
	private Date lastUpdateDate;
	
	@JsonIgnore
	@Column(name="PM_LAST_UPDATE_BY")
	private String lastUpdateBy;

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String getPropertyApprovalStatus() {
		return propertyApprovalStatus;
	}

	public void setPropertyApprovalStatus(String propertyApprovalStatus) {
		this.propertyApprovalStatus = propertyApprovalStatus;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyBookingStatus() {
		return propertyBookingStatus;
	}

	public void setPropertyBookingStatus(String propertyBookingStatus) {
		this.propertyBookingStatus = propertyBookingStatus;
	}

	public String getConstructionType() {
		return constructionType;
	}

	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}

	public Date getPossessionDate() {
		return possessionDate;
	}

	public void setPossessionDate(Date possessionDate) {
		this.possessionDate = possessionDate;
	}

	public Date getListingDate() {
		return listingDate;
	}

	public void setListingDate(Date listingDate) {
		this.listingDate = listingDate;
	}

	public String getPropertyLocality() {
		return propertyLocality;
	}

	public void setPropertyLocality(String propertyLocality) {
		this.propertyLocality = propertyLocality;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPropertyImagesPath() {
		return propertyImagesPath;
	}

	public void setPropertyImagesPath(String propertyImagesPath) {
		this.propertyImagesPath = propertyImagesPath;
	}

	public Long getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Long floorNo) {
		this.floorNo = floorNo;
	}

	public Long getPropertyBuiltupArea() {
		return propertyBuiltupArea;
	}

	public void setPropertyBuiltupArea(Long propertyBuiltupArea) {
		this.propertyBuiltupArea = propertyBuiltupArea;
	}

	public String getFurnishingStatus() {
		return furnishingStatus;
	}

	public void setFurnishingStatus(String furnishingStatus) {
		this.furnishingStatus = furnishingStatus;
	}

	public Long getNoOfBedrooms() {
		return noOfBedrooms;
	}

	public void setNoOfBedrooms(Long noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}

	public Long getNoOfBathrooms() {
		return noOfBathrooms;
	}

	public void setNoOfBathrooms(Long noOfBathrooms) {
		this.noOfBathrooms = noOfBathrooms;
	}

	public Long getNoOfCarParkings() {
		return noOfCarParkings;
	}

	public void setNoOfCarParkings(Long noOfCarParkings) {
		this.noOfCarParkings = noOfCarParkings;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getPropertyAccessbility() {
		return propertyAccessbility;
	}

	public void setPropertyAccessbility(String propertyAccessbility) {
		this.propertyAccessbility = propertyAccessbility;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}