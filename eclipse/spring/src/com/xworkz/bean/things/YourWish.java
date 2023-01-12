package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YourWish {
	
	@Autowired
	@Qualifier("hesaru")
	private String name;
	@Autowired
	private byte hands;
	@Autowired
	private int bones;
	@Autowired
	private short teeth;
	@Autowired
	private long mobileNo;
	@Autowired
	private char bloodGroup;
	@Autowired
	private boolean smart;
	@Autowired
	private double weight;
	@Autowired
	private float height;
	
	public YourWish() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "YourWish [name=" + name + ", hands=" + hands + ", bones=" + bones + ", teeth=" + teeth + ", mobileNo="
				+ mobileNo + ", bloodGroup=" + bloodGroup + ", smart=" + smart + ", weight=" + weight + ", height="
				+ height + "]";
	}

}
