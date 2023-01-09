package com.sandy3647.Java17;

//sealed class allows the inheritance to only certain classes
sealed class A permits B,C {
	
}

final class B extends A {
	
}
//final sealed and non-sealed class can extend
non-sealed class C extends A {

}

public class SealedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
