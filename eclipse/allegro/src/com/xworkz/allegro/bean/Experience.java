package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;
	
	public Experience() {
		System.out.println("created experience7777777777");
	}
	
	public void checkSkill() {
		System.out.println(this.skill.hashCode() +"hashcode of ref skill");
	}

}
