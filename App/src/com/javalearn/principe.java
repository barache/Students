package com.javalearn;

class A {
	private int a = 10;

	public int getA() {
		return a;
	}

	class B {
		private int b = 20;

		public int getB() {
			return b;
		}

	}
}

public class principe {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();

		try {
			System.out.println((double)(b.getB())/a.getA());
		} catch (Exception e) {
			e.getMessage();
		}
		

	}

}
