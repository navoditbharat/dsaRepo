/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package pattern2;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();

		for (int currentRow = 1; currentRow <= rows; currentRow++) {
			int value = currentRow * 2 - 1;

			for (int currentCol = 1; currentCol <= rows + currentRow - 1; currentCol++) {

				if (currentCol <= rows - currentRow) {
					System.out.print("	");
				} else if (currentCol <= rows) {
					System.out.print(value - rows + currentCol + "	");
				} else {
					System.out.print(value - currentCol + rows + "	");
				}

			}
			System.out.println();
		}

	}

}
