package com.swapnil;

public interface X {

	public abstract void funXA();
	public default void funXB() {
		System.out.println("Inside of interface of x of function XB");
	}
	public static void funXC() {
		System.out.println("Inside of interface of x of function XC Static ");
	}
}
