class TempleDataOperator{
	static String[] temples={null,null,null,null,null};
	static int position=0;
	static void save(String names){
    temples[position]=names;
    position++;
	}
	static void displayDetails(){
    for(int index=0;index<temples.length;index++){
		String ref=temples[index];
		System.out.println("temple list : "+ref);
	}	
	}
}