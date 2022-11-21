package com.swapnil;

public class College {

	Person p;
	
	
	
	
	
	public College(Person p) {
		super();
		this.p = p;
	}


	


	public void setP(Person p) {
		this.p = p;
	}





	public void doJob(){
		
		p.start();
		System.out.println("Job is started");
		
		
	}
}
