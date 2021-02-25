/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package array2D5;

import java.util.Scanner;

public class TakingInputAndDisplay {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = getArray();
		display(arr);

	}

	public static void display(int[][] arr) {
		int x = arr.length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] getArray() {
		System.out.println("Give number of rows of the array");
		int l = scan.nextInt();
		int[][] arr = new int[l][];
		for (int i = 0; i < l; i++) {
			System.out.println("Give number of columns of the array for row " + i);
			int b = scan.nextInt();
			arr[i] = new int[b];
			for (int j = 0; j < b; j++) {
				System.out.println("Give value of the array for row " + i + " and for column " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		return arr;
	}

}
