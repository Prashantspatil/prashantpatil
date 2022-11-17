package com.xworkz.basic_coding.examples;

public class Char_Frequency {

	public static void main(String[] args) {
		
		String name = "pray wait trust";

		name = name.toLowerCase();
		int[] freq = new int[name.length()];
		int i, j;
		char str[] = name.toCharArray();
		for (i = 0; i < name.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < name.length(); j++) {
				if (str[i] == str[j]) {
					freq[i]++;
					str[j] = 0;
				}
			}
		}
		for (i = 0; i < freq.length; i++) {
			if (str[i] != ' ' && str[i] != 0) {
				System.out.println(str[i] + "-" + freq[i]);
			}
		}
	}


}
