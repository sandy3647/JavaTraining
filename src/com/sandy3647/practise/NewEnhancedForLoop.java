package com.sandy3647.practise;

public class NewEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 4, 5 };
		for (int i : nums)
			System.out.println(i);

		// jagged arrays
		int twodarray1[][] = { { 1, 2, 3, 4 }, { 5, 6 }, { 1, 1, 1, 1 }, { 2, 2, 2 } };

		for (int[] i : twodarray1) {
			for (int j : i) {
				System.out.print(j + ",");
			}
			System.out.println();
		}
	}

}
