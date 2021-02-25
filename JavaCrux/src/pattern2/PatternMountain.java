/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package pattern2;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
		int columns = 2 * rows - 1;
		for (int currentRow = 0; currentRow < rows; currentRow++) {

			for (int currentCols = 0; currentCols < columns; currentCols++) {

				if (currentCols <= currentRow) {
					System.out.print(currentCols + 1 + "	");
				} else if (currentCols > columns - currentRow - 2) {
					System.out.print(columns - currentCols + "	");
				} else {
					System.out.print(" " + "	");
				}

			}
			System.out.println();
		}

	}

}
