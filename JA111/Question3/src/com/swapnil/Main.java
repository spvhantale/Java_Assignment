package com.swapnil;

public class Main {
	
	static void messageToStudents(Evaluation evaluation) {
		if(evaluation instanceof DsaEvaluation) {
			
			System.out.println("Its a DSA Evaluation");
			DsaEvaluation da1=(DsaEvaluation)evaluation;
			da1.evaluationTiming();
			System.out.println("================================");
		}else {
			System.out.println("Its a Coding Evaluation");
			CodingEvaluation co=(CodingEvaluation)evaluation;
			co.evaluationTiming();
			System.out.println("================================");
		}
	}
 public static void main(String[] args) {
	 messageToStudents(new DsaEvaluation(10));
	 messageToStudents(new CodingEvaluation(4));
}
}
