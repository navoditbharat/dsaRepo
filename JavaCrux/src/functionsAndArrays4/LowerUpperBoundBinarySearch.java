/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class LowerUpperBoundBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, };
		int lb = lowerBoundUsingBinary(arr, 2);

		if (lb != -1) {
			int ub = upperBoundUsingBinary(arr, 2);

			System.out.println("The Lower Bound is " + lb);
			System.out.println("The Upper Bound is " + ub);
		} else {
			System.out.println("Not found");
		}

		lb = lowerBoundUsingBinary(arr, 3);
		if (lb != -1) {
			int ub = upperBoundUsingBinary(arr, 3);
			System.out.println("The Lower Bound is " + lb);
			System.out.println("The Upper Bound is " + ub);
		} else {
			System.out.println("Not found");
		}
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
