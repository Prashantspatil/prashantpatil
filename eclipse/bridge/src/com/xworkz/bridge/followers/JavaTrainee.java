package com.xworkz.bridge.followers;

import com.xworkz.bridge.rules.Xworkz;

public class JavaTrainee extends Person implements Xworkz{
	
	@Override
	public boolean schedule() {
		return false;
	}

	@Override
	public boolean fees(double fees) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean trainers(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean placements(int totalPlacements) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean uploadedTasks(String names) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean completedProgram() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void training() {
		System.out.println("running training from java trainee");
	}
	
	public void executedProgram() {
		System.out.println("running executed program from java trainee");
	}

}
