class GraduateDataOperator{
	static String[] degree={null,null,null,null,null};
	static int position=0;
	static void save(String stream){
		degree[position]=stream;
		position++;
	}
	static void displayDetails(){
		for(int index=0;index<degree.length;index++){
			String ref=degree[index];
			System.out.println("degree list : "+ref);
		}
	}
}