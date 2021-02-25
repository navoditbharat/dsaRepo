/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		scan.close();
		long revNum = 0;
		long remainder = 0;
		while (N != 0) {
			remainder = N % 10;
			revNum = revNum * 10 + remainder;
			N = N / 10;
		}
		System.out.println(revNum);

	}

}
