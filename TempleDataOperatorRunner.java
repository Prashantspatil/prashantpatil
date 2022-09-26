class TempleDataOperatorRunner{
	public static void main(String[] ImGod){
		TempleDataOperator.displayDetails();
		System.out.println("new temple list");
		TempleDataOperator.save("srisailam");
		TempleDataOperator.save("tirupati");
		TempleDataOperator.save("shiradi");
		TempleDataOperator.save("kashi");
		TempleDataOperator.save("amarnath");
		
		TempleDataOperator.displayDetails();
	}
}