package com.ewaste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewaste.models.Ewaste;


public interface EwasteDao extends JpaRepository<Ewaste, Long> {
	 List<Ewaste> findByUsername(String username);

	
}
