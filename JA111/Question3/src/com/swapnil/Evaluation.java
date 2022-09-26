package com.swapnil;

public abstract class Evaluation {
 
	private  int numberOfQuestions;
	public abstract void evaluationTiming();
	
	public  void Evalution(int x){
		this.numberOfQuestions=x;
	}
	void printNoOfQuestions() {
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}
	
}
