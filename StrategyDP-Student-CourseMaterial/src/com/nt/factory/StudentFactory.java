package com.nt.factory;

import com.nt.comps.CourseMeterial;
import com.nt.comps.DotNetCourseMaterial;
import com.nt.comps.JavaCourseMaterial;
import com.nt.comps.Student;
import com.nt.comps.TestingCourseMaterial;

public class StudentFactory {
	
	public  static Student   getInstance(String courseType){
		   Student stud=null;
		   CourseMeterial material=null;
		    //create Target class obj
		    stud=new Student();
		    if(courseType.equalsIgnoreCase("java"))
		    	material=new JavaCourseMaterial();
		    else if(courseType.equalsIgnoreCase(".net"))
		    	material=new DotNetCourseMaterial();
		    else if(courseType.equalsIgnoreCase("testing"))
		    	material=new TestingCourseMaterial();
		    else 
		    	throw new IllegalArgumentException("Invalid Course type");
		    //assign Dependent class obj to Target class obj
		       stud.setMaterial(material);
		       return stud;
		
	}//method
}//class
