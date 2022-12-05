package com.xworkz.bridge.boot;

import com.xworkz.bridge.followers.JavaTrainee;
import com.xworkz.bridge.followers.Person;
import com.xworkz.bridge.followers.Prashant;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person = new JavaTrainee();
		
		person.setAge(24);
		person.setFirstName("prashant");
		person.setLastName("patil");
		person.setSiblings(2);
		person.setWorking(false);
		
		System.out.println(person.getAge());
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getSiblings());
		System.out.println(person.isWorking());
		
		person.eat();
		person.sleep();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		JavaTrainee javaTrainee = new JavaTrainee();
		javaTrainee.setAge(25);
		javaTrainee.setFirstName("jagadeesh");
		javaTrainee.setLastName("allagi");
		javaTrainee.setSiblings(0);
		javaTrainee.setWorking(true);
		
		System.out.println(javaTrainee.getAge());
		System.out.println(javaTrainee.getFirstName());
		System.out.println(javaTrainee.getLastName());
		System.out.println(javaTrainee.getSiblings());
		System.out.println(javaTrainee.isWorking());
		
		javaTrainee.completedProgram();
		javaTrainee.eat();
		javaTrainee.sleep();
		javaTrainee.training();
		javaTrainee.uploadedTasks("strings");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		Prashant prashant = new Prashant();
		prashant.eat();

	}

}
