package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
public class CarRunner {

	public static void main(String[] args) {
		
		String[] names= {"tiago","nexon","seltos","tuv300"};
		String[] brands= {"tata","mahindra","kia","hyundai"};
		String[] markets= {"india","us","uk","russia"};
		String[] owners= {"ratan","anand","jagadeesh","rudra"};
		String[] showRooms= {"dvaita","karuna","shah","saptagiri"};
		String[] fuelTypes= {"diesel","petrol","ethonal","cng"};
		Car car=new Car(6, 4, "2022", 12.00, 5, names, brands, markets, owners, showRooms, fuelTypes);
		car.displayDetails();

	}

}
