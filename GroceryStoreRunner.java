class GroceryStoreRunner{
	public static void main(String[] Sante){
		
		GroceryStore.setMartName("BigBasket");
		GroceryStore.setDeliveryMode("Online");
		GroceryStore.setOrderID("IP12345");
		GroceryStore.setCustomerName("prashant");
		GroceryStore.setCustomerMobileNo(7349021519L);
		GroceryStore.setAddress("rajajinagar");
		GroceryStore.setTotalItems(25);
		GroceryStore.setTotalPrice(3000);
		GroceryStore.setPaymentMode("cash");
		GroceryStore.setLocationDistance(3.567F);
		GroceryStore.setDeliveryBoyName("dawood");
		GroceryStore.setRating('5');
		GroceryStore.setOnTime(true);
		GroceryStore.setCityName("bengaluru");
		
		String ref1=GroceryStore.getMartName();
		System.out.println(ref1);
		String ref2=GroceryStore.getDeliveryMode();
		System.out.println(ref2);
		String ref3=GroceryStore.getOrderID();
		System.out.println(ref3);
		String ref4=GroceryStore.getCustomerName();
		System.out.println(ref4);
		long ref5=GroceryStore.getCustomerMobileNo();
		System.out.println(ref5);
		String ref6=GroceryStore.getAddress();
		System.out.println(ref6);
		int ref7=GroceryStore.getTotalItems();
		System.out.println(ref7);
		int ref8=GroceryStore.getTotalPrice();
		System.out.println(ref8);
		String ref9=GroceryStore.getPaymentMode();
		System.out.println(ref9);
		float ref10=GroceryStore.getLocationDistance();
		System.out.println(ref10);
		String ref11=GroceryStore.getDeliveryBoyName();
		System.out.println(ref11);
		char ref12=GroceryStore.getRating();
		System.out.println(ref12);
		boolean ref13=GroceryStore.isOnTime();
		System.out.println(ref13);
		String ref14=GroceryStore.getCityName();
		System.out.println(ref14);
	}
}