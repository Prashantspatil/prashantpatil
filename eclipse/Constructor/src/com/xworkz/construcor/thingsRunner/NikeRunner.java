package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Collection;
import com.xworkz.construcor.things.*;

public class NikeRunner {

	public static void main(String[] args) {

		String[] markets = { "ind", "russia", "us" };
		String[] ambassadors = { "kohli", "sachin", "ronaldo" };
		int[] prices = { 499, 599, 699 };
		int[] sizes = { 7, 8, 9 };
		double[] revenues = { 1.11, 2.22, 3.33 };
		double[] taxes = { 4.44, 5.55, 6.66 };

		Nike nike = new Nike("pak", 2022, "karachi", "imran", Collection.SHOES, markets, ambassadors, prices, sizes,
				revenues, taxes);

		nike.showDetails();

	}

}
