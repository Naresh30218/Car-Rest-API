package com.carapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapi.dao.CarDAO;
import com.carapi.model.Car;

@Service
public class CarService {
	@Autowired
	private CarDAO carDAO;
	
	public List<Car> getAllCars(){
		return carDAO.findAll();
	}
	
	public Car saveCar(Car c) {
		Car c2 = carDAO.save(c);
		return c2;
	}
}
