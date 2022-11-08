package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Cardiologist;
import com.xworkz.inheritance.things.Dentist;
import com.xworkz.inheritance.things.Doctor;
import com.xworkz.inheritance.things.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		
		System.out.println("Doctor started");
		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.operated);
		System.out.println("Doctor ended");
		
		System.out.println(System.lineSeparator());
		
		Doctor doctor2=new Dentist();
		Dentist dentist=(Dentist)doctor2;
		System.out.println(doctor.name);
		System.out.println(doctor.operated);
		System.out.println(dentist.clinic);
		System.out.println(dentist.name);
		System.out.println("Dentist ended");
		
		System.out.println(System.lineSeparator());
		
		Doctor doctor3=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist)doctor3;
		System.out.println(cardiologist.operated);
		System.out.println(doctor.name);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.place);
		System.out.println("Cardio ended");
		
		System.out.println(System.lineSeparator());
		
		Doctor doctor4=new ENT();
		ENT ent=(ENT)doctor4;
		System.out.println(ent.name);
		System.out.println(ent.operated);
		System.out.println(ent.consultation);
		System.out.println(ent.experience);
		System.out.println("ENT ended");

	}

}
