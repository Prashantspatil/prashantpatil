class PoliticianDataOperatorRunner{
	public static void main(String[] karnataka){
		PoliticianDataOperator.displayDetails();
		System.out.println("new constituencies list");
		PoliticianDataOperator.save("kolar");
		PoliticianDataOperator.save("bengaluru");
		PoliticianDataOperator.save("mandya");
		PoliticianDataOperator.save("hassan");
		PoliticianDataOperator.save("shahapur");
		
		PoliticianDataOperator.displayDetails();
	}
}