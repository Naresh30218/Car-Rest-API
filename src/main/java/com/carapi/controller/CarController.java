package com.carapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.dao.CarDAO;
import com.carapi.model.Car;
import com.carapi.services.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	@GetMapping("/cars")
	public List<Car> displayCar() {
		List<Car> cars = new ArrayList<Car>();
		cars = carService.getAllCars();
		return cars;
	}
	
	@PostMapping("/cars")
	public Car addCar(@RequestBody Car c) {
		Car c1=carService.saveCar(c);
		return c1;
	}
	
}
