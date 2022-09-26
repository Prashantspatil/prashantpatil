class MovieDataOperatorRunner{
	public static void main(String[] kannada){
		MovieDataOperator.displayDetails();
		System.out.println("new movie list");
		MovieDataOperator.save("kgf");
		MovieDataOperator.save("ak47");
		MovieDataOperator.save("om");
		MovieDataOperator.save("ugram");
		MovieDataOperator.save("salaga");
		
		MovieDataOperator.displayDetails();
	}
}