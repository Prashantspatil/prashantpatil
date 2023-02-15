package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FiComponent {
	
	public FiComponent() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onSend(@RequestParam String name, @RequestParam double quantity, @RequestParam String type,@RequestParam int price) {
		System.out.println("running onSend post");
		System.out.println("name : "+name);
		System.out.println("quantity : "+quantity);
		System.out.println("foodType : "+type);
		System.out.println("price : "+price);
		return "FoodItem.jsp";
		
	}

}
