package com.swapnil;

public interface Y {
	public abstract void funYA();
	public default void funYB() {
		System.out.println("Inside of interface of x of function YB");
	}
	public static void funYC() {
		System.out.println("Inside of interface of x of function YC Static");
	}
}
