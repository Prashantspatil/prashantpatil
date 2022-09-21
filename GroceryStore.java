class GroceryStore{
	static String martName;
    static String deliveryMode;
    static String orderID;
    static String customerName;
    static long customerMobileNo;
    static String address;
    static int totalItems;
    static int totalPrice;
    static String paymentMOde;
    static float locationDistance;
    static String deliveryBoyName;
    static char rating;
    static boolean onTime;
    static String cityName;

    static void setMartName(String value){
		martName=value;
	}
    static void setDeliveryMode(String value){
		deliveryMode=value;
	}	
    static void setOrderID(String value){
		orderID=value;
	}
    static void setCustomerName(String value){
		customerName=value;
	}	
    static void setCustomerMobileNo(long value){
		customerMobileNo=value;
	}	
    static void setAddress(String value){
		address=value;
	}	
    static void setTotalItems(int value){
		totalItems=value;
	}	
    static void setTotalPrice(int value){
		totalPrice=value;
	}	
    static void setPaymentMode(String value){
		paymentMOde=value;
	}	
    static void setLocationDistance(float value){
		locationDistance=value;
	}	
    static void setDeliveryBoyName(String value){
		deliveryBoyName=value;
	}
    static void setRating(char value){
		rating=value;
	}	
    static void setOnTime(boolean value){
		onTime=value;
	}	
    static void setCityName(String value){
		cityName=value;
	}
    static String getMartName(){
		return martName;
	}	
	static String getDeliveryMode(){
		return deliveryMode;
	}
	static String getOrderID(){
		return orderID;
	}
	static String getCustomerName(){
		return customerName;
	}
	static long getCustomerMobileNo(){
		return customerMobileNo;
	}
	static String getAddress(){
		return address;
	}
	static int getTotalItems(){
		return totalItems;
	}
	static int getTotalPrice(){
		return totalPrice;
	}
	static String getPaymentMode(){
		return paymentMOde;
	}
	static float getLocationDistance(){
		return locationDistance;
	}
	static String getDeliveryBoyName(){
		return deliveryBoyName;
	}
	static char getRating(){
		return rating;
	}
	static boolean isOnTime(){
		return onTime;
	}
	static String getCityName(){
		return cityName;
	}
}