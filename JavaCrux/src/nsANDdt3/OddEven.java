/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < N; j++) {
			long num = arr[j];
			long x;
			long oddSum = 0, evenSum = 0;
			while (num != 0) {
				x = num % 10;
				if (x % 2 == 0) {
					evenSum = evenSum + x;
				} else {
					oddSum += x;
				}
				num = num / 10;
			}
			if (oddSum % 3 == 0 || evenSum % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
