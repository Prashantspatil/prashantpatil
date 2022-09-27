class Color{
	static String[] colors={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String rainbow){
		colors[position]=rainbow;
		position++;
		if(position>7){
			System.out.println("No 8th color");
			return;
		}
		if(rainbow!=null && rainbow.length()>=3){
			System.out.println("color at respective position : "+rainbow +"at position : " +position);
		}
		else{
			System.err.println("color is not fit to be in rainbow");
		}
	}
	static void displayDetails(){
	for(int index=0;index<colors.length;index++){
		String ref=colors[index];
		System.out.println("color in respective index in rainbow : "+ref);
	}
	}	
	static boolean found(String color){
	if(color!=null && color.length()>=3){
		System.out.println("this color found");
	    for(int find=0;find<colors.length;find++){
			String ref=colors[find];
	        if(ref==color){
		System.out.println("color visible in rainbow");
		return true;
	}
		}
	}
	else{
		System.err.println("color not visible in rainbow");
	}return false;
	}
}