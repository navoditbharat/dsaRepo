/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long num = scan.nextInt();
		scan.close();
		long remainder = 0;
		long result = 0;
		long powerIncrement = 1;

		while (num != 0) {
			remainder = num % 8;
			result = result + remainder * powerIncrement;
			num = num / 8;
			powerIncrement = powerIncrement * 10;
		}
		System.out.println(result);

	}

}
