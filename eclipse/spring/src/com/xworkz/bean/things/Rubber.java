package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("eraser")
	private String name;
	@Autowired
	@Qualifier("variety")
	private String type;
	@Autowired
	@Qualifier("kaasu")
	private int price;
	@Autowired
	@Qualifier("banna")
	private String color;
	@Autowired
	private String shape;
	@Autowired
	@Qualifier("chored")
	private boolean stolen;
	@Autowired
	private String size;
	
	public Rubber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}
