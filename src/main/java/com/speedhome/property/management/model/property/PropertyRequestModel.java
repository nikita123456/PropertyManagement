package com.speedhome.property.management.model.property;

import java.util.Date;

public class PropertyRequestModel {

	private Long propertyId;
	
	private Long userId;
	
	private String propertyApprovalStatus;
	
	//LEASE or SALE
	private String propertyType;
	
	private String propertyBookingStatus;
	
	//Under Construction or Ready
	private String constructionType;
	
	private Date possessionDate;
	
	private Date listingDate;
	
	private Long price;
	
	private String propertyLocality;
	
	private String landmark;
	
	private Long floorNo;
	
	//Builtup Area in SqFt
	private Long propertyBuiltupArea;
	
	private String furnishingStatus;
	
	private Long noOfBedrooms;
	
	private Long noOfBathrooms;
	
	private Long noOfCarParkings;

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}
