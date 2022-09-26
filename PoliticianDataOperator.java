class PoliticianDataOperator{
	static String[] constituencies={null,null,null,null,null};
	static int position=0;
	static void save(String kshetra){
		constituencies[position]=kshetra;
		position++;
	}
	static void displayDetails(){
		for(int index=0;index<constituencies.length;index++){
			String ref=constituencies[index];
			System.out.println("constituencies list : "+ref);
		}
	}
}