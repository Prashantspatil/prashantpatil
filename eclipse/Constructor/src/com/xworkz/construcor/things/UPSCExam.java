package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Attempt;
import com.xworkz.construcor.constants.Caste;

public class UPSCExam {

	public String government;
	public int exams;
	public boolean onceInYear;
	public Attempt eligibility = Attempt.SIX;
	public Caste caste = Caste.GEN;
	public String[] post;
	public String[] ias;
	public String[] ips;
	public String[] cadre;
	public String[] state;
	public String[] centre;

	public UPSCExam(String government, int exams, boolean onceInYear, Attempt eligibility, Caste caste, String[] post,
			String[] ias, String[] ips, String[] cadre, String[] state, String[] centre) {
		super();
		this.government = government;
		this.exams = exams;
		this.onceInYear = onceInYear;
		this.eligibility = eligibility;
		this.caste = caste;
		this.post = post;
		this.ias = ias;
		this.ips = ips;
		this.cadre = cadre;
		this.state = state;
		this.centre = centre;
	}

	public void showDetails() {

		System.out.println("government : " + this.government);
		System.out.println("exams : " + this.exams);
		System.out.println("once in year : " + this.onceInYear);
		System.out.println("eligible : " + this.eligibility);
		System.out.println("caste : " + this.caste);
		System.out.println(this.post);
		System.out.println(this.ias);
		System.out.println(this.ips);
		System.out.println(this.cadre);
		System.out.println(this.state);
		System.out.println(this.centre);

		for (int i = 0; i < this.post.length; i++) {
			String string = this.post[i];
			System.out.println("post : " + string);
		}
		for (int i = 0; i < this.ias.length; i++) {
			String string = this.ias[i];
			System.out.println("ias : " + string);
		}
		for (int i = 0; i < this.ips.length; i++) {
			String string = this.ips[i];
			System.out.println("ips : " + string);
		}
		for (int i = 0; i < this.cadre.length; i++) {
			String string = this.cadre[i];
			System.out.println("cadre : " + string);
		}
		for (int i = 0; i < this.state.length; i++) {
			String string = this.state[i];
			System.out.println("state : " + string);
		}
		for (int i = 0; i < this.centre.length; i++) {
			String string = this.centre[i];
			System.out.println("centre : " + string);
		}

	}

}
