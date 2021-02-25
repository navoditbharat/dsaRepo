/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		int digit = scan.nextInt();
		scan.close();
		int time = countDigit(num, digit);
		if (time == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println(time);
		}
	}

	public static int countDigit(long num, int digit) {
		int flag = 0;
		int check;
		while (num != 0) {
			check = (int) num % 10;
			num = num / 10;
			if (check == digit) {
				flag += 1;
			}
		}

		return flag;
	}

}
