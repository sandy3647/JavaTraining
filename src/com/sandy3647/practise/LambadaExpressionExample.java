package com.sandy3647.practise;

/*
 * Types of interfaces
 * 1. Normal : more then one method
 * 2. Single abstract method(SAM interface : has only one method) - Functional Interface - Lambada expressions (Java 8(scala))
 * 3. Marker interface(no methods, example serializable)
 * 
 * Lambada expression work with only SAM interfaces
 */

//below is the SAM interface we can also use the @FunctionalInterface annotation but its not mandatory
@FunctionalInterface // not mandatory just to make sure we dont add more abstract methods in the
						// interface but we can add default methods
interface Labc {
	void show();
}

public class LambadaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labc abc = new Labc() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("The anonymous class emaple");

			}
		};

		abc.show();

		// now we do the above with the lambada expressions

		Labc xyz = () -> {
			System.out.println("This is awesome Lambada expression");
			System.out.println("Yet another Printl");
		};
		xyz.show();

	}

}
