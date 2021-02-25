/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package pattern2;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();

		for (int row = 0; row < rows; row++) {
			int half = rows / 2;
			int missingStars = 0;
			if (row == 0 || row == rows - 1) {
				missingStars = 0;
			} else if (row <= half) {
				missingStars = 2 * (row) - 1;
			} else {
				missingStars = (rows - row - 1) * 2 - 1;
			}
			for (int column = 0; column < rows; column++) {
				if (row == 0 || row == rows - 1) {
					System.out.print("*	");
				} else if (column < rows / 2 - missingStars / 2 || column > rows / 2 + missingStars / 2) {
					System.out.print("*	");
				} else {
					System.out.print("	");
				}
			}
			System.out.println();
		}

	}

}
