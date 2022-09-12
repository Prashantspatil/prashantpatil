class Milestone{
	static void showTheResponsibility(){
		System.out.println("Responsibility starts here :-");
		int age=18;
		char gender='F';
		
		if(age==10){
			System.out.println("going to school");
			return;
		}
		if(age==16){
			System.out.println("going to college");
			return;
		}
		if(age==18){
			System.out.println("universal adult franchise");
			System.out.println("eligible for F1 race");
			if(gender=='F'){
			System.out.println("girls legally can marry");
			}
			else{
				System.out.println("girls legally can't marry");
			return;
			}
			return;
		}
		if(age==21){
			System.out.println("char bottle down");
			System.out.println("boys can legally marry");
			return;
		}
		if(age==21 || age==22 || age==23){
			System.out.println("you are graduate");
			return;
		}
		if(age==23 || age==25){
			System.out.println("getting job");
			return;
		}
		if(age==28){
			System.out.println("giving birth to kids");
			return;
		}
		if(age==30){
			System.out.println("having another kid");
			return;
		}
		if(age==45){
			System.out.println("kids future");
			return;
		}
		if(age==50){
			System.out.println("kids education");
			return;
		}
		if(age==58){
			System.out.println("retiring");
			return;
		}
		if(age==60){
			System.out.println("playing with grand kids");
			return;
		}
		if(age==70){
			System.out.println("RIP");
			return;
		}
		System.out.println("responsibility stops here");
	}
}