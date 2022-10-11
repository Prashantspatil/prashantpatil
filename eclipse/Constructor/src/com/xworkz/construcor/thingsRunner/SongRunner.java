package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class SongRunner {

	public static void main(String[] args) {
		
		Song title = new Song();
		System.out.println(title.name);
		
		Song bhashe = new Song();
		System.out.println(bhashe.language);
		
		Song haadugara = new Song();
		System.out.println(haadugara.singer);
		
		Song barahagara = new Song();
		System.out.println(barahagara.lyricist);
		
		Song genre = new Song();
		System.out.println(genre.type);
		
		title.name = "Neenu Bagehareyada";
		System.out.println("nan favourite song : " + title.name);
		
		bhashe.language = "Kannada";
		System.out.println("nam bhashe : " + bhashe.language);
		
		haadugara.singer = "Prashant";
		System.out.println("iconic singer : " + haadugara.singer);
		
		barahagara.lyricist = "Jagadeesh";
		System.out.println("star lyricist : " + barahagara.lyricist);
		
		genre.type = "Romantic";
		System.out.println("romantic song : " + genre.type);
		
	}

}
