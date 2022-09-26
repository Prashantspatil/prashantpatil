class GraduateDataOperatorRunner{
	public static void main(String[] vtu){
		GraduateDataOperator.displayDetails();
		System.out.println("new degree list");
		GraduateDataOperator.save("be");
		GraduateDataOperator.save("bca");
		GraduateDataOperator.save("bba");
		GraduateDataOperator.save("bbm");
		GraduateDataOperator.save("mta");
		
		GraduateDataOperator.displayDetails();
	}
}