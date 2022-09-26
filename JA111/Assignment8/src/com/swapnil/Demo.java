package com.swapnil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1) {
			int x= Integer.parseInt(args[0]);
			int mul=1;
			for(int i=1;i<=x;i++) {
				mul=mul*i;
			}
			System.out.println(mul);
		}else if(args.length==2) {
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int num=Math.abs(x-y);
			int mul=1;
			for(int i=1;i<=num;i++) {
				mul=mul*i;
			}
			System.out.println(mul);
		}else if(args.length>=3) {
			System.out.println("Error");
		}
	}

}
