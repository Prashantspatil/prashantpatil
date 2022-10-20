package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.FullName;
import com.xworkz.construcor.constants.Numerals;
import com.xworkz.construcor.things.Password;

public class PasswordRunner {

	public static void main(String[] args) {
		
		Password password=new Password(7349021519L, Numerals.FOUR, FullName.STUDENT1);
		
		password.display();

	}

}
