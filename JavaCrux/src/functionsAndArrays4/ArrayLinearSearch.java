/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

import java.util.Scanner;

public class ArrayLinearSearch {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = ArrayGodClass.getArray();
		arrayLinearSearch(arr);

	}

	public static void arrayLinearSearch(int[] arr) {
		System.out.println("Give value you want to search?");
		int val = scan.nextInt();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				System.out.println("Presnt at index " + i);
				flag += 1;
			}
		}
		if (flag == 0) {
			System.out.println("Not Found");
		}
	}
}