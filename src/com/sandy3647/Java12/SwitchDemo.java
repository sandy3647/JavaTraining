package com.sandy3647.Java12;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Monday";
		// below is the old way of doing
		switch (day) {
		case "Monday":
			System.out.println("7am");
			break;
		case "Tuesday", "Thursday":
			System.out.println("8am");
			break;
		default:
			System.out.println("9am");
		}

		// New way of switch
		switch (day) {

		case "Monday" -> System.out.println("7am");

		case "Tuesday", "Thursday" -> System.out.println("8am");

		default -> System.out.println("9am");
		}

		// New way of switch
		String result = switch (day) {

		case "Monday" -> "7am";

		case "Tuesday", "Thursday" -> "8am";

		default -> "9am";
		
		};
		
		// New way of switch
		System.out.println(result);
		
		String result1 = switch (day) {

		case "Monday" : yield "7am";

		case "Tuesday", "Thursday" : yield "8am";

		default : yield "9am";
		
		};
		
		System.out.println(result1);
	}

}
