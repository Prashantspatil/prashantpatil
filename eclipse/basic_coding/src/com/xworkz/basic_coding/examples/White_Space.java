package com.xworkz.basic_coding.examples;

import java.util.Scanner;

public class White_Space {

	public static void main(String[] args) {
		
		String str = "bharat maata ki jai";
		String s[] = str.split(" ");
		Scanner sp = new Scanner(System.in);
		String rev = sp.next();
		String name = "";
		for(int i=0; i<s.length; i++) {
			if(s[i].equals(rev)) {
				char ch[] = rev.toCharArray();
				for(int j=ch.length-1; j>=0; j--) {
					name = name+ch[j];
				}
			}
		}
		for(int i=0; i<s.length; i++) {
			if(s[i].equals(rev)) {
				s[i] = name;
			}
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]+"");
		}
	}

}

/*String name="Hi hello how are you sir";
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
System.out.println("count : "+count);*/