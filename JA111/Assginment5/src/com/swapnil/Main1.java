package com.swapnil;

public class Main1 {
	void fun1(char ch) {
	
		if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
			System.out.println(ch+" "+"is vowels");
		}else if(ch>='a' && ch<='z') {
			System.out.println(ch+" "+"is consonant");
		}else {
			System.out.println(ch+" "+"is invalid character");
		}
	}
	
	public static void main(String[] args) {
		
		Main1 d=new Main1();
		d.fun1('*');
	}

}
