package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.MetroLines;
import com.xworkz.construcor.constants.ParliamentMember;
import com.xworkz.construcor.things.*;

public class BengaluruRunner {

	public static void main(String[] args) {

		byte no = 28;
		String[] stations = { "ksr", "ypr", "ylk" };
		String[] codes = { "40", "41", "42" };
		String[] areas = { "rajaji", "vijay", "prakash" };
		String[] parties = { "inc", "bjp", "jds" };
		String[] streets = { "vishnu", "raj", "puneeth" };
		String[] personalities = { "dada", "appaji", "ambi" };

		Bengaluru bengaluru = new Bengaluru("kempegowda", "kar", no, ParliamentMember.CENTRAL, MetroLines.GREEN_LINE,
				stations, codes, areas, parties, streets, personalities);

		bengaluru.showCase();

	}

}
