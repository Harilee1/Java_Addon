package com.demo;

public class Multilevel extends Parent1 {
			
	public static void main(String[] args) {
		System.out.println(add());
		System.out.println(sub());
		System.out.println(mul());
	}
	
}
	class Parent1 extends child{
		public static int a=10;
		public static int b=20;
    public static int add() {
    	return a+b;
    }
    }

	class child extends grandson{
		public static int a=10;
		public static int b=20;
    public static int sub() {
    	return a-b;
    }
	}
	class grandson{
		public static int a=10;
		public static int b=20;
    public static int mul() {
    	return a*b;
    }
	}
