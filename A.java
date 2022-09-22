package com.example1;

abstract class A{
	int value1;
	String Value2;
	abstract void method1();
	abstract void method2();	
}

abstract class B extends A{
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("From method 1");
	}
	
	B(int i,String S1)
	{
		this.value1 = i;
		this.Value2 = S1;
	}
}
class C extends B{
	
	@Override
	void method2() {
	}
		// TODO Auto-generated method stub
		C(int i,String s1)
		{
			super(i,s1);
			
		}	
}

public class Manager2 {

		public static void main(String[] args) {
			
			C obj = new C(10,"govind");
			
			System.out.println(obj.value1);
			System.out.println(obj.Value2);
			
		}
}