package com.xworkz.bean.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.bean")
public class MonitorConfiguration {
	
	public MonitorConfiguration() {
		System.out.println("running MonitorConfiguration");
	}
	
	

	
	@Bean
	public String dell() {
		System.out.println("creayed dell");
		String string=new String();
		return string;
	}
	
	@Bean
	public String hp() {
		System.out.println("creayed hp");
		String string=new String();
		return string;
	}
	
	@Bean
	public String lenovo() {
		System.out.println("creayed dell");
		String string=new String();
		return string;
	}
	
	@Bean
	public String acer() {
		System.out.println("creayed dell");
		String string=new String();
		return string;
	}
	
	@Bean
	public String apple() {
		System.out.println("creayed dell");
		String string=new String();
		return string;
	}
	
	@Bean
	public Boolean pen() {
		System.out.println("creayed pen");
		Boolean boo=new Boolean(true);
		return boo;
	}
	
	@Bean("classPencil")
	public Boolean pencil() {
		System.out.println("creayed pencil");
		Boolean boo=new Boolean(true);
		return boo;
	}
	
	@Bean("classRubber")
	public Boolean rubber() {
		System.out.println("creayed rubber");
		Boolean boo=new Boolean(true);
		return boo;
	}
	
	@Bean
	public Boolean sketch() {
		System.out.println("creayed sketch");
		Boolean boo=new Boolean(true);
		return boo;
	}
	
	@Bean
	public Boolean sharpner() {
		System.out.println("creayed sharpner");
		Boolean boo=new Boolean(true);
		return boo;
	}
	
	@Bean
	public Double pay() {
		System.out.println("created pay");
		Double a=new Double(1D);
		return a;
	}
	
	@Bean
	public Double recieve() {
		System.out.println("created recieve");
		Double a=new Double(1D);
		return a;
	}
	
	@Bean
	public Double cheque() {
		System.out.println("created cheque");
		Double a=new Double(1D);
		return a;
	}
	
	@Bean
	public Double dd() {
		System.out.println("created dd");
		Double a=new Double(1D);
		return a;
	}
	
	@Bean
	public Double neft() {
		System.out.println("created neft");
		Double a=new Double(1D);
		return a;
	}
	
	@Bean
	public StringBuffer name() {
		System.out.println("created name");
		StringBuffer buffer=new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuffer surname() {
		System.out.println("created surname");
		StringBuffer buffer=new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuffer nickname() {
		System.out.println("created name");
		StringBuffer buffer=new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuffer petname() {
		System.out.println("created name");
		StringBuffer buffer=new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuffer penname() {
		System.out.println("created name");
		StringBuffer buffer=new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuilder place() {
		System.out.println("created place");
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder location() {
		System.out.println("created location");
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder spot() {
		System.out.println("created spot");
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder chair() {
		System.out.println("created chair");
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder bag() {
		System.out.println("created bag");
		StringBuilder builder=new StringBuilder();
		return builder;
	}
	
	@Bean
	public ArrayList list() {
		System.out.println("created arraylist");
		ArrayList array=new ArrayList();
		array.add("mallan");
		array.add("abhi");
		array.add("vins");
		array.add("shru");
		array.add("pooji");
		System.out.println(array.size());
		return array;
	}
		
		public Map map() {
			System.out.println("created map");
		Map<String, Double> pair=new HashMap<String, Double>();
		pair.put("mallan", 85D);
		pair.put("abhi", 75D);
		pair.put("pooji", 65D);
		pair.put("shru", 55D);
		pair.put("vins", 45D);
		return pair;
	}
	
}
