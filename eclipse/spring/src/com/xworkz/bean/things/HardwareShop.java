package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	private int id;
	@Autowired
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	@Qualifier("ownerName")//when field & bean does not match
	private String owner;
	@Autowired
	private String address;
	
	public HardwareShop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", owner=" + owner + ", address="
				+ address + "]";
	}

}
