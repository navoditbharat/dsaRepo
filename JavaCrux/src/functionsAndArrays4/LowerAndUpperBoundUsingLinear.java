/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

import java.util.Scanner;

public class LowerAndUpperBoundUsingLinear {
//	Find Lower and Upper Bound of a number in a sorted array using Linear Search

	public static void main(String[] args) {

		int[] arr = ArrayGodClass.getArray();
		int[] sortedArray = ArrayGodClass.arrayInsertionSort(arr);
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the numnber to find upper and lower bound");
		int num = scan.nextInt();
		scan.close();

		int lb = lowerBound(sortedArray, num);
		if (lb != -1) {
			int ub = UpperBound(sortedArray, num);

			System.out.println("The Lower Bound is " + lb);
			System.out.println("The Upper Bound is " + ub);

		} else {
			System.out.println("Not  Found");
		}
	}

	public static int UpperBound(int[] sortedArray, int num) {
		int flag = -1;
		for (int counter = 0; counter < sortedArray.length; counter++) {
			if (num == sortedArray[counter]) {
				flag = counter;
			}
		}
		return flag;
	}

	public static int lowerBound(int[] sortedArray, int num) {
		int flag = -1;
		for (int counter = 0; counter < sortedArray.length; counter++) {
			if (num == sortedArray[counter]) {
				flag = counter;
				break;
			}
		}
		return flag;
	}

}
