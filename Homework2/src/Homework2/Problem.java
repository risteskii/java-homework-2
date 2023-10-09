package Homework2;

import java.util.ArrayList;
import java.util.List;

public class Problem {
	// Using Arrays
	public static Car[] generateCarsArray() {
		Car[] cars = new Car[30];
		
		
		cars[0] = new Car(1, "Peugeot", "207", 2008, "Orange", 3500, "PP5052AB");
		cars[1] = new Car(2, "Audi", "A3", 2015, "Gray", 13500, "PP3295AE") ;
		cars[2] = new Car(3, "Audi", "A1", 2008, "Black", 7000, "SK6345AC") ;
		cars[3] = new  Car(4, "Audi", "A4", 1998, "Green", 1500, "SK6635AE") ;
		cars[4] = new  Car(5, "Audi", "A3", 2020, "Gray", 50000, "KU3455AE") ;
		cars[5] = new  Car(6, "Audi", "A6", 2021, "Blue", 76000, "ST2535AS") ;
		cars[6] = new  Car(7, "Peugeot", "208", 2015, "Red", 17000, "SU2463AD") ;
		cars[7] = new  Car(8, "Peugeot", "207", 2013, "Pink", 13000, "KR2645AD") ;
		cars[8] = new  Car(9, "Peugeot", "501", 2012, "Gray", 12500, "KM7253AB") ;
		cars[9] = new  Car(10, "Peugeot", "206", 2015, "Brown", 2800, "KM7345AE") ;
		cars[10] = new  Car(11, "Mercedes", "c501d", 2001, "Brown", 5600, "SK6995AB") ;
		cars[11] = new  Car(12, "Mercedes", "M3", 2012, "Metallic Gray", 12000, "ST2354AD") ;
		cars[12] = new  Car(13, "Mercedes", "M4", 2003, "Matt Gray", 6000, "OH2131AD") ;
		cars[13] = new  Car(14, "Mercedes", "225", 2004, "Violet", 3200, "OH1111AE") ;
		cars[14] = new  Car(15, "Mercedes", "AMG ONE", 2023, "Metallic Black", 3000000, "PP5052AC") ;
		cars[15] = new  Car(16, "BMW", "M4", 2018, "Blue", 69695, "PP5232AF") ;
		cars[16] = new  Car(17, "BMW", "i8", 2022, "Yellow", 143400, "BT3246AC") ;
		cars[17] = new  Car(18, "BMW", "M3", 2013, "Pink", 23280, "SK1245AD") ;
		cars[18] = new  Car(19, "BMW", "X6", 2020, "Gray", 68745, "OH1526AF") ;
		cars[19] = new  Car(20, "BMW", "M4", 2015, "Black", 35823, "SR8455AF") ;
		cars[20] = new  Car(21, "Honda", "Civic", 2006, "Brown", 3350, "ST9945AD") ;
		cars[21] = new  Car(22, "KIA", "Rio", 2011, "Gray", 5603, "KR8489AC") ;
		cars[22] = new  Car(23, "KIA", "Sorento", 2020, "Matt Gray", 26990, "MK9845BA") ;
		cars[23] = new  Car(24, "Hyundai", "Santa Fe", 2008, "Violet", 6820, "SK6595BD") ;
		cars[24] = new  Car(25, "Hyundai", "Tucson", 2018, "Metallic Black", 23530, "PP6633AF") ;
		cars[25] = new  Car(26, "Hyundai", "Elantra", 2021, "Blue", 26450, "SK4157AC") ;
		cars[26] = new  Car(27, "Hyundai", "Sonata", 2009, "Red", 18195, "BT4648AD") ;
		cars[27] = new  Car(28, "Porsche", "Carrera 911", 2013, "Gray", 93700, "SK6842BC") ;
		cars[28] = new  Car(29, "Porsche", "GT3", 2023, "Yellow", 223800, "PP1849AD") ;
		cars[29] = new  Car(30, "Ferrari", "488 Spider", 2021, "Red", 421410, "PP3654AB") ;
		
		return cars;
	}
	

	public static void main(String[] args) {
		Car[] cars = generateCarsArray();
		
//		Subtask 1
		String makeFilter = "Peugeot";
		System.out.println("Subtask 1:");
		for(int i=0; i<cars.length; i++) {
			if(cars[i].isProducedBy(makeFilter)) {
				cars[i].showInfo();
			}
		}
		System.out.println("\n\n");
		
//		Subtask 2
		String modelFilter = "207";
		int yearsUsedFilter = 2;
		System.out.println("Subtask 2:");
		for(int i=0; i<cars.length; i++) {
			if(cars[i].isModelAndOlderThan(modelFilter, yearsUsedFilter)) {
				cars[i].showInfo();
			}
		}
		System.out.println("\n\n");
		
//		Subtask 3
		int yearOfManufacture = 2015;
		int price = 5000;
		System.out.println("Subtask 3:");
		for(int i=0; i<cars.length; i++) {
			if(cars[i].isYearManufacturedAndPriceHigherThan(yearOfManufacture, price)) {
				cars[i].showInfo();
			}
		}
		System.out.println("\n\n");
		
//		Print All
		System.out.println("All:");
		for(int i=0; i<cars.length; i++) {
			cars[i].showInfo();
		}
		System.out.println("\n\n");
	}
}


class Car{
	private long id;
	private String make;
	private String model;
	private int yearOfManufacture;
	private String color;
	private int price;
	private String registrationNumber;
	
	public Car(long id, String make, String model, int yearOfManufacture, String color, int price,
			String registrationNumber) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}
	
	public void showInfo() {
		System.out.print("Id: " + id);
		System.out.print("\tMake: " + make);
		System.out.print("\tModel: " + model);
		System.out.print("\tYear: " + yearOfManufacture);
		System.out.print("\tPrice: " + price);
		System.out.print("\tRegNum: " + registrationNumber );
		System.out.print("\tColor: " + color + "\n");
	}

//	Subtask 1
	public boolean isProducedBy(String make) {
		if(this.make == make)
			return true;
		else
			return false;
	}
	
//	Subtask 2
	public boolean isModelAndOlderThan(String model, int years) {
		int yearsOld = 2023 - this.yearOfManufacture;
		
		if(this.model == model && yearsOld > years)
			return true;
		else
			return false;
	}
	
//	Subtask 3
	public boolean isYearManufacturedAndPriceHigherThan(int yearOfManufacture, int price) {
		if(this.yearOfManufacture == yearOfManufacture && this.price > price)
			return true;
		else
			return false;
	}
}
