package com.demo;
import java.util.Scanner;
/**
 * 
 */
public class Sample {
//	static int a=10;
//	final int B=20;
//	Sample(){
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+" DANIsh");
//		}
//		}
public static void main(String[] args) {
//		Sample obj=new Sample();
//	
////		int c=a+b;
////		System.out.println("add of a and b is "+c);
////		System.out.println("value of B is"+obj.B);
//	int n=123;
//	int ld=0;
////	int rev=0;
//	int sum=0;
//	while(n>0) {
//		ld=n%10;
//		sum=sum+ld;
////		rev=rev*10+ld;
//		n=n/10;
//    }
//    System.out.println(""+sum);
//
//
//int num=123;
//byte conv=(byte)num;
//System.out.println(conv);
//System.out.println(num);
//
//
	


int mul=1;
Scanner get=new Scanner(System.in);
int n=get.nextInt();
int[] obj=new int[n];
for(int i=0;i<obj.length;i++) {
	obj[i]=get.nextInt();
}
for(int i=0;i<obj.length;i++) {
	mul=mul*obj[i];
}
System.out.println(mul);

}
static boolean func() {
String str="hari";
int l=0;
int r=str.length()-1;
while(l<=r) {
	if(str.charAt(l)==str.charAt(r)) {
		l++;
		r--;
		
	}
	else {
		return false;
	}
}return true;
}



//   int a=10;
//   int b=20;
//   a=a+b;
//   b=a-b;
   
   
}
