package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
import com.xworkz.construcor.constants.*;
public class OnePlusRunner {

	public static void main(String[] args) {
		
		int[] rams= {8,10,12};
		int[] varients= {64,128,256};
		String[] markets= {"ind","russia","us"};
		double[] revenues= {1.11,2.22,3.33};
		float[] taxes= {4.44F,5.55F,6.66F};
		short[] years= {2022,2023,2024};
		
		OnePlus onePlus=new OnePlus("1+7", 31.5, 128, "blue", Model.SEVEN, rams, varients, markets, revenues, taxes, years);
		
		onePlus.showDetails();

	}

}
