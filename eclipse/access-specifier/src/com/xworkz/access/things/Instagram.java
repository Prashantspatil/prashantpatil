package com.xworkz.access.things;

public class Instagram {

	private String developer="Meta";
	private String authors="kevin&mike";
	private String release="10/2010";
	public double size;
	public int languages;
	public String coding;
	public double downloads;
	public boolean thirdParty;
	public String hq;
	public String head;
	public String country;
	
	public Instagram(double size, int languages, String coding, double downloads, boolean thirdParty, String hq,
			String head, String country) {
		super();
		this.size = size;
		this.languages = languages;
		this.coding = coding;
		this.downloads = downloads;
		this.thirdParty = thirdParty;
		this.hq = hq;
		this.head = head;
		this.country = country;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}
	 
}
