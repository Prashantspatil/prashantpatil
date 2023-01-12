package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	@Value("1")
	private int id;
	private String name;
	private String ownerName;
	@Value("kannada")
	private String language;
	private double price;
	
	@Autowired
	public NewsPaper(@Qualifier("newsPaperName")String name,@Qualifier("newsPaperName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	@Value("6.5")
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

}
