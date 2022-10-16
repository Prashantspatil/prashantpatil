package com.xworkz.construcor.things;

public class TextileShop {

	public String shopName;
	public String owner;
	public String gstPin;
	public String street;
	public String place;
	public long contact;
	public int shopNo;

	public TextileShop() {

	}

	public TextileShop(String shopName) {
		this();
		this.shopName = shopName;
	}

	public TextileShop(String shopName, String owner) {
		this(shopName);
		this.owner = owner;
	}

	public TextileShop(String shopName, String owner, String gstPin) {
		this(shopName, owner);
		this.gstPin = gstPin;
	}

	public TextileShop(String shopName, String owner, String gstPin, String street) {
		this(shopName, owner, gstPin);
		this.street = street;
	}

	public TextileShop(String shopName, String owner, String gstPin, String street, String place) {
		this(shopName, owner, gstPin, street);
		this.place = place;
	}

	public TextileShop(String shopName, String owner, String gstPin, String street, String place, long contact) {
		this(shopName, owner, gstPin, street, place);
		this.contact = contact;
	}

	public TextileShop(String shopName, String owner, String gstPin, String street, String place, long contact,
			int shopNo) {
		this(shopName, owner, gstPin, street, place, contact);
		this.shopNo = shopNo;
	}

	public TextileShop(String shopName, long contact) {
		this(shopName);
		this.contact = contact;
	}

}
