package com.bezkoder.springjwt.models;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.bezkoder.springjwt.models.Ewaste;

public interface EwasteDao extends JpaRepository<Ewaste, Long> {

}
