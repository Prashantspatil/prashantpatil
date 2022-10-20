package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Designation;
import com.xworkz.construcor.things.*;

public class PMRunner {

	public static void main(String[] args) {

		String[] operations = { "uri", "balakot" };
		String[] missions = { "jal jeevan", "bhim" };
		String[] projects = { "cheetah", "demonitization" };
		String[] countries = { "us", "uk" };
		String[] cabinets = { "shah", "parikar" };
		String[] friends = { "rahul", "kejriwal" };

		PM pm = new PM("modi", "vadnagar", 73, Designation.PM, true, operations, missions, projects, countries,
				cabinets, friends);

		pm.showDetails();

	}

}
