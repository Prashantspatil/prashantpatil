class MovieDataOperator{
	static String[] movies={null,null,null,null,null};
	static int position=0;
	static void save(String chalanachitra){
		movies[position]=chalanachitra;
		position++;
	}
	static void displayDetails(){
		for(int index=0;index<movies.length;index++){
			String ref=movies[index];
			System.out.println("movies list : "+ref);
		}
	}
}