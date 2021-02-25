/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package array2D5;

public class WavePrint {

	public static void main(String[] args) {
		int[][] arr = TakingInputAndDisplay.getArray();

		TakingInputAndDisplay.display(arr);
		System.out.println("_______________________");
		wavePrint(arr);

	}

	public static void wavePrint(int[][] arr) {
		int rows = arr.length;
		for (int i = 0; i < rows; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int k = arr[i].length - 1; k >= 0; k--) {
					System.out.print(arr[i][k] + " ");
				}
			}
			System.out.println();
		}
	}

}
