package com.sandy3647.practise;

class Student {
	int rollnum;
	String name;
}

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[5];
		nums[0] = 0;
		nums[1] = 3;
		nums[2] = 33;
		nums[3] = 77;
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);

		Student std[] = new Student[4];

		std[0] = new Student();
		std[0].name = "san";
		std[0].rollnum = 6;

		System.out.println(std[0].toString());

		int numbe[] = { 1, 2, 3, 4 };
		for (int i = 0; i < numbe.length; i++)
			System.out.println(numbe[i]);

		int twodarray[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
		
		for(int i = 0; i < twodarray.length; i++) {
			for(int j = 0; j < twodarray[i].length; j++) {
				System.out.print(twodarray[i][j] + ",");
			}
			System.out.println();				
		}
		
		//jagged arrays
		int twodarray1[][] = { { 1, 2, 3, 4 }, { 5, 6}, { 1, 1, 1, 1 }, { 2, 2, 2} };
		
		for(int i = 0; i < twodarray1.length; i++) {
			for(int j = 0; j < twodarray1[i].length; j++) {
				System.out.print(twodarray1[i][j] + ",");
			}
			System.out.println();				
		}
	}

}
