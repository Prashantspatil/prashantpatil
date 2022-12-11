package com.xworkz.basic_coding.examples;

public class TestQue {

	public static void main(String[] args) {
	  
		String array[] = {"true","true","false","true","true","false","false","false","true"};
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]=="true") {
				count++;
			}
		}
         System.out.println("sheeps present =" +count);
         System.out.println(System.lineSeparator());
         
         int[] b = {2,3,4,5,6,7};
         int[] c = {2,3,6,7,9,10};
         
         for(int i=0;i<b.length;i++) {
        	 for(int j=0;j<c.length;j++) {
        		 if(b[i]==c[j]) {
        			 System.out.print(b[i]);
        		 }
        	 }
         }
         System.out.println(System.lineSeparator());
         
         int[] a = {1,2,3,4,5,2,3,4,1,6,7,8};
         for(int i=0;i<a.length;i++) {
        	 int count1=0;
        	 for(int j=0;j<a.length;j++) {
        		 if(a[i]==a[j]) {
        			 count1++;
        		 }
        	 }
        	 if(count1==1) {
        		 System.out.print(a[i]);
        	 }
         }System.out.println(System.lineSeparator());
         
         for(int i=1;i<=6;i++) {
        	 for(int j=1;j<=7;j++) {
        		 if(i==2 || i==6 || j==1 || j==7 || i==1 & j==3 || i==1 & j==5 || i==1 & j==7|| i==3 & j==4 || i==4 & j==4 || i==5 & j==4) {
        			 System.out.println("* ");
        		 }else {
        			 System.out.println("  ");
        		 }
        	 }System.out.println();
         }System.out.println(System.lineSeparator());
         
         String input= "Be yourself; everyone else is taken.";
         String[] var=input.split(" ");
         for(int i=0;i<var.length;i++) {
        	 if(i==2) {
        		 StringBuffer buff=new StringBuffer(var[2]);
        		 buff.reverse();
        		 String name=buff.toString();
        		 var[2]=name;
        	 }System.out.println(var[i] + " ");
         }
	}

}
