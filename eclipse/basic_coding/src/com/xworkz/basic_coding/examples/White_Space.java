package com.xworkz.basic_coding.examples;

public class White_Space {

	public static void main(String[] args) {
		
		String name="Hi hello how are you sir";
		//name=name.replaceAll("\\s+","");
		int count = 0;
		char[] array = name.toCharArray();
		for (int i = 0; i < name.length()-1; i++) {
			System.out.println(array[i]);
			if(array[i]==' ') {
				count++;
			}
			
		}
		System.out.println("All space removed:"+name);
        System.out.println("count : "+count);
	}

}

