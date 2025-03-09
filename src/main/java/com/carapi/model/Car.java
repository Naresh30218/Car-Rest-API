package com.carapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long carId;
	private String modelName;
	private String colour;
	private int price;
//	@ManyToOne
//	private Company company;
}
