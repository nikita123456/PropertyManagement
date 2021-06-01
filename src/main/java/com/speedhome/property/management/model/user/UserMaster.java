package com.speedhome.property.management.model.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TBL_USER_MASTER")
public class UserMaster implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_MASTER")
	@SequenceGenerator(name = "SEQ_USER_MASTER", sequenceName = "SEQ_USER_MASTER")
	@Column(name="UM_ID")
	private Long userId;
	
	@Column(name="UM_FIRST_NAME")
	private String firstName;
	
	@Column(name="UM_MIDDLE_NAME")
	private String middleName;
	
	@Column(name="UM_LAST_NAME")
	private String lastName;
	
	@Column(name="UM_EMAIL")
	private String email;
	
	@Column(name="UM_MOBILE")
	private String mobile;
	
	@Column(name="UM_LOGIN_ID")
	private String username;
	
	@Column(name="UM_PASSWORD")
	private String password;
	
	@Column(name="UM_ACTIVE")
	private String active;
	
	@Column(name="UM_CREATE_BY")
	private String createBy;
	
	@Column(name="UM_CREATE_DT")
	private Date createDate;
	
	@Column(name="UM_LAST_UPD_BY")
	private String lastUpdBy;
	
	@Column(name="UM_LAST_UPD_DT")
	private Date lastUpdDate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdBy() {
		return lastUpdBy;
	}

	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}

	public Date getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

}

