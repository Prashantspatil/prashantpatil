package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.MakeUpDto;

public class MakeUpDtoRunner {

	public static void main(String[] args) {
		
		MakeUpDto makeUpDto1=new MakeUpDto("lipstick", "loreal", 99D);
		MakeUpDto makeUpDto2=new MakeUpDto("kajal", "nykaa", 199D);
		MakeUpDto makeUpDto3=new MakeUpDto("foundation", "lakme", 299D);
		MakeUpDto makeUpDto4=new MakeUpDto("powder", "ponds", 49D);
		
		Collection<MakeUpDto> collection=new LinkedList<MakeUpDto>();
		collection.add(makeUpDto1);
		collection.add(makeUpDto2);		
		collection.add(makeUpDto3);
		collection.add(makeUpDto4);
		
		Iterator<MakeUpDto> ref=collection.iterator();
		while (ref.hasNext()) {
			 MakeUpDto element =  ref.next();
			 if (element.getPrice()>200) {
					System.out.println(element.getBrand());
					System.out.println(true);
			}
		}
		Iterator<MakeUpDto> ref1=collection.iterator();
        while (ref1.hasNext()) {
			MakeUpDto makeUp = (MakeUpDto) ref1.next();
			if ("lakme".equals(makeUp.getBrand())) {
				System.out.println(makeUp);
			}
		}
	}

}
