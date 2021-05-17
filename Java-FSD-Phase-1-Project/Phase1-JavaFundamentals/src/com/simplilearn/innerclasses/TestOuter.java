package com.simplilearn.innerclasses;

public class TestOuter {
	
	private int data = 100;
	public String msg = "Today is good day !";
	
	
	// non static inner class
	class TestInner {
		
		private String msg2 = "Tommorow is ParleG !";
		
		public void showData() {
			System.out.println("Data :: "+data);
			System.out.println("Msg1 :: "+msg);
			System.out.println("Msg2 :: "+msg2);
		}
		
	}

	public static void main(String[] args) {
		
		// outer class instance
		TestOuter outer = new TestOuter();
		
		// inner class instance
		TestOuter.TestInner inner = outer.new TestInner();
		
		inner.showData();
	}
}
