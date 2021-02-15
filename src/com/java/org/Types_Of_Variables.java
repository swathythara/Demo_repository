package com.java.org;

public class Types_Of_Variables {
	static int b;
	public void test() {
		int a = 10;
		System.out.println("local variable =" +a);
	//	System.out.println("Instance variable =" +tv.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Types_Of_Variables tv = new Types_Of_Variables();
				tv.test();
	System.out.println("Static variable =" +b);	
	}
	

}

