class ProductsRunner{
	public static void main(String[] ProductDetails){
		
		System.out.println("Entered ProductDetails : ");
		System.out.println("Total ProductDetails : "+ProductDetails.length);
		if(ProductDetails.length>=4){
			System.out.println("ProductDetails are good");
		}
		else{
			System.out.println("ProductDetails are not good");
		}
		String name=ProductDetails[0];
		System.out.println("the name : "+name);
		String type=ProductDetails[1];
        System.out.println("the product type : "+type);
		String price=ProductDetails[2];
		System.out.println("the price : "+price);
		int convertedPrice=Integer.parseInt(price);
		System.out.println("converted Price is : "+convertedPrice);
		if(convertedPrice<=150){
			System.out.println("entered price is negotiable");
		}
		else{
			System.out.println("entered price is costly");
		}
		String quantity=ProductDetails[3];
		System.out.println("product quantity : "+quantity);
		int convertedQuantity=Integer.parseInt(quantity);
		System.out.println("converted quantity : "+convertedQuantity);
		if(convertedQuantity<=15){
			System.out.println("quantity sufficient");
		}
		else{
			System.out.println("more quantity");
		}
		String quality=ProductDetails[4];
		System.out.println("product quality : "+quality);
		boolean convertedQuality=Boolean.parseBoolean(quality);
		System.out.println("converted quality : "+convertedQuality);
		if(convertedQuality){
			System.out.println("product quality is good");
		}
		else{
			System.out.println("product quality not good");
		}
		int total=convertedPrice*convertedQuantity;
        System.out.println("Total price : "+total);
        System.out.println("Exit");		
	}
}