/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package array2D5;

public class DeclaringArray2D {

	public static void main(String[] args) {

		int[][] arr = new int[3][3]; // We can initialise array like this

		int[][] array;
		// System.out.println(array); Gives error of not initialising array
		array = new int[3][3]; // Array has been initialised here with 3*3 dimension.
		System.out.println(array); // Print command is giving us location of array in memory.

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 7, 8, 9 } };
		display(arr1);

		arr1[0][1] = 20;
		arr1[2][2] = 500;
		display(arr1);

		int[][] arr2 = new int[3][]; // Only 1D array created with Null "reference" inside it
		arr2[0] = new int[5]; // Allocates five length arrray to 0th reference with values 0
		arr2[2] = new int[3];

		System.out.println(arr2[0][2]);
		System.out.println(arr2[2][1]);
		System.out.println(arr2[1][2]); // Null Pointer Exception
		System.out.println(arr[3][1]); // Array index out of bound Exception
		// int[][] arr2 = new int[][2]; This Statement is invalid.

	}

	public static void display(int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
