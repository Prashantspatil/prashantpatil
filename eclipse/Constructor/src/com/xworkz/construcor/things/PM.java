package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Designation;

public class PM {

	public String name;
	public String place;
	public int age;
	public Designation degn = Designation.PM;
	public boolean married;
	public String[] operation;
	public String[] mission;
	public String[] project;
	public String[] visited;
	public String[] cabinet;
	public String[] friend;

	public PM(String name, String place, int age, Designation degn, boolean married, String[] operation,
			String[] mission, String[] project, String[] visited, String[] cabinet, String[] friend) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.degn = degn;
		this.married = married;
		this.operation = operation;
		this.mission = mission;
		this.project = project;
		this.visited = visited;
		this.cabinet = cabinet;
		this.friend = friend;
	}

	public void showDetails() {
		
		System.out.println("name : "+this.name);
		System.out.println("place : "+this.place);
		System.out.println("age : "+this.age);
		System.out.println("designation : "+this.degn);
		System.out.println("marital status : "+this.married);
		System.out.println(this.operation);
		System.out.println(this.mission);
		System.out.println(this.project);
		System.out.println(this.visited);
		System.out.println(this.cabinet);
		System.out.println(this.friend);
		
		for (int i = 0; i < this.operation.length; i++) {
			String string = this.operation[i];
			System.out.println("operation : "+string);
		}
		for (int i = 0; i < this.mission.length; i++) {
			String string = this.mission[i];
			System.out.println("mission : "+string);
		}
		for (int i = 0; i < this.project.length; i++) {
			String string = this.project[i];
			System.out.println("project : "+string);
		}
		for (int i = 0; i < this.visited.length; i++) {
			String string = this.visited[i];
			System.out.println("country : "+string);
		}
		for (int i = 0; i < this.cabinet.length; i++) {
			String string = this.cabinet[i];
			System.out.println("cabinet : "+string);
			}
		for (int j = 0; j < this.friend.length; j++) {
			String string = this.friend[j];
			System.out.println("friend : "+string);
		}
		
	}

}
