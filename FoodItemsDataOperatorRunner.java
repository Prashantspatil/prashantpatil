class FoodItemsDataOperatorRunner{
	public static void main(String[] UttaraKarnataka){
		FoodItemsDataOperator.displayDetails();
		System.out.println("new main course list");
		FoodItemsDataOperator.save("kadak roti");
		FoodItemsDataOperator.save("indi");
		FoodItemsDataOperator.save("mosaru");
		FoodItemsDataOperator.save("kara");
		FoodItemsDataOperator.save("majjige");
		
		FoodItemsDataOperator.displayDetails();
	}
}