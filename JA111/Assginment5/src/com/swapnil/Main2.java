package com.swapnil;

public class Main2 {

	public static void main(String[] args) {

		Shapes d=new Shapes();
		Circle c1=new Circle();
		c1.radius=10;
		d.area(c1);
		Rectangle r1=new Rectangle();
		r1.length=10;
		r1.breath=10;
		d.area(r1);
		
		
	//static polymorphism:-
//		More than one method with same name but with 
//			diff parameter (which method will be executed will be 
//			decided at compiler time ),we achieve static 
//			polymorphism using overloading.
// 		The main drawback of the static polymorphism is compiler goes to the ambigious state and will generate compilation error.
	
	}

}
