package com.file.test;

import java.io.File;
import java.io.IOException;

public class TestCar {

	public static void main(String[] args) {
		
		try {
			
			Car car1 = new Car("Toyoto001",2022,0,1282);
			Car car2 = new Car("Toyoto001",2022,0,12);
			Car car3 = new Car("Toyoto003",2022,0,13);
			Car car4 = new Car("Toyoto004",2022,0,14);
			Car car5 = new Car("Toyoto005",2022,0,15);
			Car car6 = new Car("Toyoto006",2022,0,16);
			
			//Creat a array for storing cars
			Car cars[] =new Car[]{car1,car2,car3,car4,car5,car6};
			
			CarList carlist = new CarList("E://car.txt");
			
			File file = new File("E://car.txt");
			file.delete();
			
			//Add car objects in a file
			for(Car car: cars) {
				carlist.addCar(car);
			}
			
			
			System.out.println("Total New Cars :"+carlist.countNewCars());
			
			System.out.println("Most Expensive Car :"+carlist.mostExpensiveCar());
			
			carlist.removeCar(car2);
			System.out.println("Total New Cars After remove car :"+carlist.countNewCars());
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
