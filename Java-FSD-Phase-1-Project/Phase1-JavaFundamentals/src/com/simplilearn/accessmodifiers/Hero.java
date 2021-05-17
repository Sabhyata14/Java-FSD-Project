package com.simplilearn.accessmodifiers;

public class Hero {

	// protected properties
		protected String power = "Healing Power :: Wolworeen";
		
		// protected method
		protected void usePower() {
			System.out.println("The Greate power of all :: "+power);
		}
		
		public void showPower() {
			System.out.println("Show all :: "+power);
		}
}
