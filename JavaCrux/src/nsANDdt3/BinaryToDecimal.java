/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		scan.close();

		int convtNum = binaryToDecimal(num);
		System.out.println(convtNum);

	}

	public static int binaryToDecimal(long num) {
		int result = 0;
		int powerIncrement = 1;
		int remainder = 0;

		while (num != 0) {
			remainder = (int) num % 10;
			result = result + remainder * powerIncrement;
			powerIncrement = powerIncrement * 2;
			num = num / 10;

		}
		return result;

	}

}
