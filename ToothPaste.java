class ToothPaste{
	static String brand;
	static byte price;
	static String manufacturingDate;
	static String expiryDate;
	static boolean saltContent;
	static float weight;
	static String name;
	static String color;
	static String flavour;
	static boolean packaged;
	static boolean withBrush;
	static boolean buyOneGetOne;
	static long customers;
	static long unitsSold;
	static int adsOnTV;
	
	static void setBrand(String value)
	{
		brand=value;
	}
	static void setPrice(byte value)
	{
		price=value;
	}
	static void setManufacturingDate(String value)
	{
		manufacturingDate=value;
	}
	static void setExpiryDate(String value)
	{
		expiryDate=value;
	}
	static void setSaltContent(boolean value)
	{
		saltContent=value;
	}
	static void setWeight(float value)
	{
		weight=value;
	}
	static void setName(String value)
	{
		name=value;
	}
	static void setColor(String value)
	{
		color=value;
	}
	static void setFlavour(String value)
	{
		flavour=value;
	}
	static void setPackaged(boolean value)
	{
		packaged=value;
	}
	static void setWithBrush(boolean value)
	{
		withBrush=value;
	}
	static void setBuyOneGetOne(boolean value)
	{
		buyOneGetOne=value;
	}
	static void setCustomers(long value)
	{
		customers=value;
	}
	static void setUnitsSold(long value)
	{
		unitsSold=value;
	}
	static void setAdsOnTV(int value)
	{
		adsOnTV=value;
	}
	
	static String getBrand(){
		return brand;
	}
	static byte getPrice(){
		return price;
	}
	static String getManufacturingDate(){
		return manufacturingDate;
	}
	static String getExpiryDate(){
		return expiryDate;
	}
	static boolean isSaltContent(){
		return saltContent;
	}
	static float getWeight(){
		return weight;
	}
	static String getName(){
		return name;
	}
	static String getColor(){
		return color;
	}
	static String getFlavour(){
		return flavour;
	}
	static boolean isPackaged(){
		return packaged;
	}
	static boolean isWithBrush(){
		return withBrush;
	}
	static boolean isBuyOneGetOne(){
		return buyOneGetOne;
	}
	static long getCustomers(){
		return customers;
	}
	static long getUnitsSold(){
		return unitsSold;
	}
	static int getAdsOnTV(){
		return adsOnTV;
	}
}