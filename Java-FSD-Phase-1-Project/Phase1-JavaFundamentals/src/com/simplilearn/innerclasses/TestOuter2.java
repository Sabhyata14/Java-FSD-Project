package com.simplilearn.innerclasses;

public class TestOuter2 {
	
	// static properties
	private static int data = 100;
	public static String msg = "Today is good day !";
	
	
	// static inner class
	static class TestInner {
		
		private String msg2 = "Tommorow is ParleG !";
		
		public void showData() {
			System.out.println("Data :: "+data);
			System.out.println("Msg1 :: "+msg);
			System.out.println("Msg2 :: "+msg2);
		}
		
	}

	public static void main(String[] args) {
		
		// create object of inner class
		TestOuter2.TestInner inner =  new TestOuter2.TestInner();
		
		inner.showData();
	}
}
