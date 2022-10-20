package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Codes;
import com.xworkz.construcor.constants.Numbers;
import com.xworkz.construcor.constants.Type;

public class TimeMachineRunner {

	public static void main(String[] args) {
		
		TimeMachine machine=new TimeMachine("sonata", Type.PENDULUM, Numbers.HUNDRED, Codes.Z, 5.30, 7349021518L);
		machine.knowTime();

	}

}
