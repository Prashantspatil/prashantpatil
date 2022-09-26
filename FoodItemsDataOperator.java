class FoodItemsDataOperator{
	static String[] mainCourse={null,null,null,null,null};
	static int position=0;
	static void save(String southIndian){
		mainCourse[position]=southIndian;
		position++;
	}
	static void displayDetails(){
		for(int index=0;index<mainCourse.length;index++){
			String ref=mainCourse[index];
			System.out.println("main Course list : "+ref);
		}
	}
}