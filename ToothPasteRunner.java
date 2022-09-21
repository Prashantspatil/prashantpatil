class ToothPasteRunner{
	public static void main(String[] Example){
		
		ToothPaste.setBrand("Colgate");
		ToothPaste.setPrice((byte)45);
		ToothPaste.setManufacturingDate("30/11,2022");
		ToothPaste.setExpiryDate("30/11,2023");
		ToothPaste.setSaltContent(true);
		ToothPaste.setWeight(120.45F);
		ToothPaste.setName("Charcoal");
		ToothPaste.setColor("black");
		ToothPaste.setFlavour("mint");
		ToothPaste.setPackaged(true);
		ToothPaste.setWithBrush(true);
		ToothPaste.setBuyOneGetOne(false);
		ToothPaste.setCustomers(7349021619L);
		ToothPaste.setUnitsSold(7349021519L);
		ToothPaste.setAdsOnTV(20000);
		
		String ref1=ToothPaste.getBrand();
		System.out.println(ref1);
		byte ref2=ToothPaste.getPrice();
		System.out.println(ref2);
		String ref3=ToothPaste.getManufacturingDate();
		System.out.println(ref3);
		String ref4=ToothPaste.getExpiryDate();
		System.out.println(ref4);
		boolean ref5=ToothPaste.isSaltContent();
		System.out.println(ref5);
		float ref6=ToothPaste.getWeight();
		System.out.println(ref6);
		String ref7=ToothPaste.getName();
		System.out.println(ref7);
		String ref8=ToothPaste.getColor();
		System.out.println(ref8);
		String ref9=ToothPaste.getFlavour();
		System.out.println(ref9);
		boolean ref10=ToothPaste.isPackaged();
		System.out.println(ref10);
		boolean ref11=ToothPaste.isWithBrush();
		System.out.println(ref11);
		boolean ref12=ToothPaste.isBuyOneGetOne();
		System.out.println(ref12);
		long ref13=ToothPaste.getCustomers();
		System.out.println(ref13);
		long ref14=ToothPaste.getUnitsSold();
		System.out.println(ref14);
		int ref15=ToothPaste.getAdsOnTV();
		System.out.println(ref15);
	}
}