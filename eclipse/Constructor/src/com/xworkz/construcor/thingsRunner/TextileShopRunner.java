package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class TextileShopRunner {

	public static void main(String[] args) {

		TextileShop shop = new TextileShop();
		System.out.println("shop name : " + shop.shopName);
		System.out.println("owner : " + shop.owner);
		System.out.println("gst pin : " + shop.gstPin);
		System.out.println("street : " + shop.street);
		System.out.println("place : " + shop.place);
		System.out.println("contact : " + shop.contact);
		System.out.println("shop no : " + shop.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop2 = new TextileShop("Juicey Shop");
		System.out.println("shop name : " + shop2.shopName);
		System.out.println("owner : " + shop2.owner);
		System.out.println("gst pin : " + shop2.gstPin);
		System.out.println("street : " + shop2.street);
		System.out.println("place : " + shop2.place);
		System.out.println("contact : " + shop2.contact);
		System.out.println("shop no : " + shop2.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop3 = new TextileShop("Juicy Shop", 7349021519L);
		System.out.println("shop name : " + shop3.shopName);
		System.out.println("owner : " + shop3.owner);
		System.out.println("gst pin : " + shop3.gstPin);
		System.out.println("street : " + shop3.street);
		System.out.println("place : " + shop3.place);
		System.out.println("contact : " + shop3.contact);
		System.out.println("shop no : " + shop3.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop4 = new TextileShop("Juicy Shop", "Vijay Malya");
		System.out.println("shop name : " + shop4.shopName);
		System.out.println("owner : " + shop4.owner);
		System.out.println("gst pin : " + shop4.gstPin);
		System.out.println("street : " + shop4.street);
		System.out.println("place : " + shop4.place);
		System.out.println("contact : " + shop4.contact);
		System.out.println("shop no : " + shop4.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop5 = new TextileShop("Juicy Shop", "Vijay Malya", "22AAAAA0000A1Z5");
		System.out.println("shop name : " + shop5.shopName);
		System.out.println("owner : " + shop5.owner);
		System.out.println("gst pin : " + shop5.gstPin);
		System.out.println("street : " + shop5.street);
		System.out.println("place : " + shop5.place);
		System.out.println("contact : " + shop5.contact);
		System.out.println("shop no : " + shop5.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop6 = new TextileShop("Juicy Shop", "Vijay Malya", "22AAAAA0000A1Z5", "Dalaal Street");
		System.out.println("shop name : " + shop6.shopName);
		System.out.println("owner : " + shop6.owner);
		System.out.println("gst pin : " + shop6.gstPin);
		System.out.println("street : " + shop6.street);
		System.out.println("place : " + shop6.place);
		System.out.println("contact : " + shop6.contact);
		System.out.println("shop no : " + shop6.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop7 = new TextileShop("Juicy Shop", "Vijay Malya", "22AAAAA0000A1Z5", "Dalaal Street", "KGF");
		System.out.println("shop name : " + shop7.shopName);
		System.out.println("owner : " + shop7.owner);
		System.out.println("gst pin : " + shop7.gstPin);
		System.out.println("street : " + shop7.street);
		System.out.println("place : " + shop7.place);
		System.out.println("contact : " + shop7.contact);
		System.out.println("shop no : " + shop7.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop8 = new TextileShop("Juicy Shop", "Vijay Malya", "22AAAAA0000A1Z5", "Dalaal Street", "KGF",
				7349021519L);
		System.out.println("shop name : " + shop8.shopName);
		System.out.println("owner : " + shop8.owner);
		System.out.println("gst pin : " + shop8.gstPin);
		System.out.println("street : " + shop8.street);
		System.out.println("place : " + shop8.place);
		System.out.println("contact : " + shop8.contact);
		System.out.println("shop no : " + shop8.shopNo);

		System.out.println(System.lineSeparator());
		TextileShop shop9 = new TextileShop("Juicy Shop", "Vijay Malya", "22AAAAA0000A1Z5", "Dalaal Street", "KGF",
				7349021519L, 73);
		System.out.println("shop name : " + shop9.shopName);
		System.out.println("owner : " + shop9.owner);
		System.out.println("gst pin : " + shop9.gstPin);
		System.out.println("street : " + shop9.street);
		System.out.println("place : " + shop9.place);
		System.out.println("contact : " + shop9.contact);
		System.out.println("shop no : " + shop9.shopNo);

	}

}
