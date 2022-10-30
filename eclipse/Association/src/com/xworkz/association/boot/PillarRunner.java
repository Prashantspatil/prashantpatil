package com.xworkz.association.boot;

import com.xworkz.association.constants.Shape;
import com.xworkz.association.things.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
		
		Pillar pillar=new Pillar(1111, "yadgir", Shape.CUBOID, 93, "BOSCH");
		pillar.showPillar();

	}

}
