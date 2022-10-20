package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;
import com.xworkz.construcor.constants.*;

public class UPSCExamRunner {

	public static void main(String[] args) {

		String[] posts = { "ips", "ias" };
		String[] iass = { "prashant", "jagadeesh" };
		String[] ipss = { "kp", "yogya" };
		String[] cadres = { "glb", "blr" };
		String[] states = { "kar", "ap" };
		String[] centres = { "klb", "yr" };

		UPSCExam exam = new UPSCExam("central", 9, true, Attempt.SIX, Caste.GEN, posts, iass, ipss, cadres, states,
				centres);

		exam.showDetails();

	}

}
