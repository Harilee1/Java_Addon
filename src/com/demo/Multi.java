package com.demo;

public interface Multi extends Parent3,Parent4,Parent5 {
		
		public  void meth1();
		public  void meth2();
	
}
interface Parent3{
	public  void meth1();
	public  void meth2();
}
interface Parent4{
	public  void meth1();
	public  void meth2();
}
interface Parent5{
	public  void meth1();
	public  void meth2();
}