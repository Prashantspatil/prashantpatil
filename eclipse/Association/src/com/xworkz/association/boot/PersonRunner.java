package com.xworkz.association.boot;

import com.xworkz.association.things.Address;
import com.xworkz.association.things.City;
import com.xworkz.association.things.Country;
import com.xworkz.association.things.Email;
import com.xworkz.association.things.Industry;
import com.xworkz.association.things.Job;
import com.xworkz.association.things.Locations;
import com.xworkz.association.things.Person;
import com.xworkz.association.things.State;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person=new Person("Prashant");
		Job job=new Job(4.50, "project manager", 3);
		Industry industry=new Industry("tata", "ratan");
		Country country=new Country("hindustan", "new delhi", +91, 136.00);
		Address address=new Address();
		City city=new City("yadgir", 585202, true, 9.99);
		State state=new State("kannadanadu", "bommai", "yakshagana", "bengaluru");
		Locations locations=new Locations(53, "21st main");
		locations.setCityStateCountry(city, state, country);
		industry.setAddress(address);
		job.setIndustry(industry);
		person.setJob(job);
		
		Email email=new Email("xyz@gmail.com", "1234", 7349021518L);
		email.setIndustry(industry);
		Email email2=new Email("abc@gmail.com", "1235", 7349021517L);
		email2.setIndustry(industry);
		Email email3=new Email("def@gmail.com", "1236", 7349021516L);
		email3.setIndustry(industry);
		Email email4=new Email("pqr@gmail.com", "1237", 7349021515L);
		email4.setIndustry(industry);
		Email[] emails= {email,email2,email3,email4};
		
		person.setEmail(emails);
		person.displayPerson();

	}

}
