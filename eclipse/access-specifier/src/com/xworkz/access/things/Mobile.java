package com.xworkz.access.things;

public class Mobile {
	
	public String name="oneplus";
	public Android android=new Android(1.00, 150, "five G", 111.00, true, "1200", "17s", "20d");
	
	public void unBox() {
		System.out.println(this.name);
		if (this.android!=null) {
			System.out.println(this.android);
			System.out.println(android.hang);
			System.out.println(android.market);
			System.out.println(android.netWork);
			System.out.println(android.nokia);
			System.out.println(android.oppo);
			System.out.println(android.units);
			System.out.println(android.users);
			System.out.println(android.vivo);
			
			System.out.println(android.getGadget());
			android.setGadget("pocket world");
			System.out.println("modified gadget " + android.getGadget());
			
			System.out.println(android.getType());
			android.setType("handset");
			System.out.println("modified type " + android.getType());
			
			System.out.println(android.getVersion());
			android.setVersion("11.09.09");
			System.out.println("modified version " + android.getVersion());
		}
		else {
			System.out.println("android is null");
		}
	}

}
