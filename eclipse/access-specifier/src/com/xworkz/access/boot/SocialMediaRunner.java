package com.xworkz.access.boot;

import com.xworkz.access.things.Instagram;
import com.xworkz.access.things.SocialMedia;

public class SocialMediaRunner {

	public static void main(String[] args) {
		
		SocialMedia media=new SocialMedia();
		Instagram instagram=new Instagram(50.00, 32, "python", 113.00, true, "milon park", "adam", "america");
		
		System.out.println(media.app);
		System.out.println(media.instagram);
		System.out.println(instagram.getAuthors());
		System.out.println(instagram.getDeveloper());
		System.out.println(instagram.getRelease());
		
		media.use();

	}

}
