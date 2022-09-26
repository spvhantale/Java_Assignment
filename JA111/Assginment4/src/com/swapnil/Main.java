package com.swapnil;

public class Main {
	
	void whole(int num) {
		if(num%2==1) {
			System.out.println(num);
		}else if(num%2==0) {
			int x=num/10;
		System.out.println((x+1)*10);	
		}else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main s=new Main();
		s.whole(34);
	}

}
