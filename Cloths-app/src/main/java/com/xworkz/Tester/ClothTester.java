package com.xworkz.Tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.cloths.Entity.ClothesEntity;
import com.xworkz.cloths.dao.ClothDAOImpl;
import com.xworkz.cloths.dao.ClothsDAO;

public class ClothTester {
	public static void main(String[] args) throws ParseException {
		ClothesEntity clothesEntity = new ClothesEntity();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
		Date date = null;
			clothesEntity.setId(1);
			clothesEntity.setBrand("Raymond");
			clothesEntity.setPrice(500.25);
			date=dateFormat.parse("1958");
			clothesEntity.setYear(date);
			
			ClothsDAO clothesDAO=new ClothDAOImpl();
		clothesDAO.saveClothes(clothesEntity);
			System.out.println("saved successfully");
			
//			updateClotheBrandAndPriceById(String brand, double price, int id)
//			clothesDAO.getClothesById(3);
//			System.out.println(clothesEntity.toString());
//			System.out.println("successfully getched");
			
//			public void updateClotheBrandAndPriceById(String brand,double price,int id)
//			clothesDAO.updateClotheBrandAndPriceById("jockey",4983.78 , 1);
//			System.out.println("successfully updated");
		
//			public void deleteById(int id)
//			clothesDAO.deleteById(2);
//			System.out.println("succesfully deleted");
		
//			public void updatemanufacturedYearById(Date manufacturedYear,int id);
//			date=dateFormat.parse("1982");
//			clothesDAO.updatemanufacturedYearById(date, 1);
//			System.out.println("updated successgully");
		
	}

}
