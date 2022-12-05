package com.xworkz.bridge.rules;

public interface Xworkz {
	
	boolean schedule();
	boolean fees(double fees);
	boolean trainers(String name);
	boolean placements(int totalPlacements);
	boolean uploadedTasks(String names);
	boolean completedProgram();

}
