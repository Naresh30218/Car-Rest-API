package com.carapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carapi.model.Car;

@Repository
public interface CarDAO extends JpaRepository<Car, Long>{
	
}
