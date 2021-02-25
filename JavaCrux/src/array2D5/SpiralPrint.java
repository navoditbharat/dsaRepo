/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package array2D5;

public class SpiralPrint {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		spiralPrint(arr);

	}

	public static void spiralPrint(int[][] arr) {

		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1;
		int count = (bottom + 1) * (right + 1);
		int dir = 1;

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						count -= 1;
						if (i == right) {
							dir = 2;
						}
						;
					}
				}
				if (dir == 2) {

					for (int i = top + 1; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count -= 1;
						if (i == bottom)
							dir = 3;
					}
				}
				if (dir == 3) {
					for (int i = right - 1; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count -= 1;
						if (i == left) {
							dir = 4;
						}
					}
				}
				if (dir == 4) {

					for (int i = bottom - 1; i > top; i--) {
						System.out.print(arr[i][left] + " ");
						count -= 1;
						if (i == top + 1) {
							dir = 1;
							top += 1;
							bottom -= 1;
							left += 1;
							right -= 1;
						}
					}

				}
			}
			if (count == 0) {
				System.out.println("END");
				break;
			}
		}
	}

}
