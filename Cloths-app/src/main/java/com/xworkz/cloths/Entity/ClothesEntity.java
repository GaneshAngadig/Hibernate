package com.xworkz.cloths.Entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;




@Data
@Entity
@Table(name="clothes")
public class ClothesEntity {
	@Id
	@Column(name="cloths_id")
	private int id;
	private String brand;
	private double price;
	private Date year;
	
}
