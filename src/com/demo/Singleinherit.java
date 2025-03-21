package com.demo;
import java.util.Scanner;

public class Singleinherit extends Parent {

	 public static void main(String args[]) {
		System.out.println(add());
//		add();
		 System.out.println();
	 }
}
 class Parent{
//	 Scanner in=new Scanner(System.in);
	public static int a=10;
	public static int b=10;
	 public static int add() {
		 return a+b;
	 }
//	public static int add(int a,int b) {
//		return a+b;
//	}
}
