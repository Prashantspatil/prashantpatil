package com.xworkz.access.things;

public class SocialMedia {
	
	public String app="insta";
	public Instagram instagram=new Instagram(50.00, 32, "python", 113.00, true, "milon park", "adam", "america");
	
	public void use() {
		System.out.println(this.app);
		if (this.instagram!=null) {
			System.out.println(this.instagram);
			System.out.println(instagram.coding);
			System.out.println(instagram.country);
			System.out.println(instagram.downloads);
			System.out.println(instagram.head);
			System.out.println(instagram.hq);
			System.out.println(instagram.languages);
			System.out.println(instagram.size);
			System.out.println(instagram.thirdParty);
			
			System.out.println(instagram.getAuthors());
			instagram.setAuthors("prashant&jagadeesh");
			System.out.println("modified authors " + instagram.getAuthors());
			
			System.out.println(instagram.getDeveloper());
			instagram.setDeveloper("meta platforms");
			System.out.println("modified developer " + instagram.getDeveloper());
			
			System.out.println(instagram.getRelease());
			instagram.setRelease("06/10/2010");
			System.out.println("modified release " + instagram.getRelease());
		}
		else {
			System.out.println("instagram is null");
		}
	}

}
