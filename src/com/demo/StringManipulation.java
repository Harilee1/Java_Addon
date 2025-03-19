package com.demo;

public class StringManipulation {
		public static void main(String args[])
		{
			boolean res=func();
			if((res)==true) {
				System.out.println("it is a palindrome");
			}
			else {
				System.out.println("it is not a palindrome");
			}
			
			String str="hiarii";
//			String obj=new String();
//			obj="hari";
//			if(str==obj) {
//				System.out.println("true");
//			}
//			else {
//				System.out.println("false");
//			}
//			System.out.println(str.toUpperCase());
//			System.out.println(str.charAt(0));
//			System.out.println(str.isEmpty());
//			System.out.println(str.indexOf('i',2));
			System.out.println(str.substring(0,4));
			System.out.println(str.toCharArray());   //array of char
			char[]stca=str.toCharArray();
			System.out.println(str.split("a"));
			System.out.println(str.concat("haran"));//array of string
			
			
		}
		static boolean func() {
			String str="hari";
			int temp=0;
			int l=0;
			int r=str.length()-1;
			while(l<=r) {
				if(str.charAt(l)==str.charAt(r)) {
					
					l++;
					r--;
					
//					
					
				}
				else {
					return false;
				}
			}return true;
			}
		
}
