package com.speedhome.property.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.speedhome.property.management.model.user.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Long> {
	UserMaster findByUsername(String username);
	UserMaster findByUserId(Long userId);
}
