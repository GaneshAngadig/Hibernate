package com.xworkz.cloths.dao;

import java.util.Date;

import com.xworkz.cloths.Entity.ClothesEntity;

public interface ClothsDAO {
	public void saveClothes(ClothesEntity clothesEntity);
	public ClothesEntity getClothesById(int clothId);
	public void updateClotheBrandAndPriceById(String brand,double price,int id);
	public void deleteById(int id);
	public void updatemanufacturedYearById(Date manufacturedYear,int id);

}
