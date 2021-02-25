/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package pattern2;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
		ArrayList<Integer> aList = new ArrayList<>();

		aList.add(0);
		aList.add(1);
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(aList.get(counter) + " ");
				int num = aList.get(counter) + aList.get(counter + 1);
				counter += 1;
				aList.add(num);
			}
			System.out.println();
		}

	}

}
