package com.nt.test;

import com.nt.comps.Student;
import com.nt.factory.StudentFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Student stud=null;
		//get Target class obj (Student class obj)
		stud=StudentFactory.getInstance("java");
		//invoke the methods
		stud.prepareForJob();
		System.out.println("...........................................");
		stud=StudentFactory.getInstance(".net");
		stud.prepareForJob();

	}

}
