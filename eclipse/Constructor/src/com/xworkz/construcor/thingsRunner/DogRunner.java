package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
import com.xworkz.construcor.constants.*;
public class DogRunner {

	public static void main(String[] args) {
		
		String[] countries= {"ind","pak"};
		String[] talents= {"rescue","military"};
		String[] types= {"black","panda"};
		String[] names= {"charlie","bond"};
		String[] colors= {"brown","blue"};
		double[] prices= {12.00,13.00};
		
		Dog dog=new Dog("german", "male", 5, 18, Breeder.DOG, countries, talents, types, names, colors, prices);
		
		dog.showDetails();
		

	}

}
