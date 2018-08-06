package com.nt.comps;

public  final class Student {
	private CourseMeterial  material;
	
	public  void setMaterial(CourseMeterial material){
		this.material=material;
	}
	
	public  void prepareForJob(){
		String  knowledge=null;
		knowledge=material.courseContent();
		System.out.println("Attended/attending "+knowledge+"courses");
		System.out.println("Searching for  software job");
	}

}
