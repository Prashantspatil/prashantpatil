class Person{
	static void work(String company,float salary){
		System.out.println("Entered the company & salary : ");
	    if(company=="TCS" && salary==4.5F){
			System.out.println("Company : "+company);
		    System.out.println("Salary : "+salary);
			return;
		}
	}
	static void work(String company,float salary,String designation){
		System.out.println("Entered the company,salary & designation : ");
		if(company=="TCS" && salary==4.5F && designation=="Team Leader"){
			System.out.println("Company : "+company);
			System.out.println("Salary : "+salary);
			System.out.println("Designation : "+designation);
			return;
		}
	}
}