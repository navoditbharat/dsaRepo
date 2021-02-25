
/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */

import java.util.Scanner;

public class ArrayGodClass1D {
	static Scanner scan = new Scanner(System.in);

	public static void displayArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static int[] getArray() {
		System.out.println("Size of Array?");
		int sizeArray = scan.nextInt();
		int[] arr = new int[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			System.out.println("Give Value for " + i + " index of array.");
			arr[i] = scan.nextInt();
		}

		return arr;
	}

	public static void swap(int[] arr, int i, int j) {

//		Checking if this swap function is able to swap values in main array or not

		int z = arr[i];
		arr[i] = arr[j];
		arr[j] = z;
//		Working Swap   ... When we give array as input to any method it takes reference to base memory location of array 
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

	public static void arrayBinarySearch(int[] arrayBin) {

		System.out.println("Give value you want to search?");
		int val = scan.nextInt();
		int last = arrayBin.length - 1;
		int first = 0;
		int flag = 0;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (val < arrayBin[mid]) {
				last = mid - 1;
			} else if (val > arrayBin[mid]) {
				first = mid + 1;
			} else {
				System.out.println("The index is " + first);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Not Found");
		}
	}

	public static int[] arraySelectionSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int secCount = counter + 1; secCount < arr.length; secCount++) {
				if (arr[counter] > arr[secCount]) {
					swap(arr, counter, secCount);
				}
			}
		}

		return arr;
	}

	public static int[] arrayBubbleSort(int[] array) {
		int flag = 0;
		for (int lo = 0; lo < array.length - 1; lo++) {
			for (int hi = 0; hi < array.length - flag - 1; hi++) {
				if (array[hi + 1] < array[hi]) {

					swap(array, hi + 1, hi);
				}
			}
			flag += 1;
		}

		return array;
	}

	public static int[] arrayInsertionSort(int[] arr) {
		int l = arr.length;

		for (int counter = 1; counter < l; counter++) {
			int val = arr[counter]; // value of current counter saved

			int revCounter = counter - 1;

			while (revCounter >= 0 && val < arr[revCounter]) {
				arr[revCounter + 1] = arr[revCounter];
				revCounter--;
			}
			arr[revCounter + 1] = val;
		}

		return arr;
	}

	public static int upperBoundUsingBinary(int[] arr, int num) {

		int hi = arr.length - 1, lo = 0, mid = 0;
		int currentAns = -1;

		while (lo <= hi) {

			mid = (hi + lo) / 2;

			if (arr[mid] < num) {
				lo = mid + 1;
			} else if (arr[mid] > num) {
				hi = mid - 1;
			} else {
				currentAns = mid;
				lo = mid + 1;
			}
		}
		return currentAns;
	}

	public static int lowerBoundUsingBinary(int[] arr, int num) {

		int hi = arr.length - 1, lo = 0, mid = 0;
		int currentAns = -1;

		while (hi >= lo) {

			mid = (hi + lo) / 2;

			if (arr[mid] < num) {
				lo = mid + 1;
			} else if (arr[mid] > num) {
				hi = mid - 1;
			} else {
				currentAns = mid;
				hi = mid - 1;
			}
		}
		return currentAns;
	}

}
