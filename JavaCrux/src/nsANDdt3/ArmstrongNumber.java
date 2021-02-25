/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		int flag = 0;
		int remainder = 0;
		long num = n;
		ArrayList<Integer> aList = new ArrayList<>();
		while (n != 0) {
			remainder = (int) n % 10;
			aList.add(remainder);
			n = n / 10;
			flag += 1;
		}
		long sum = 0;
		for (int j = 0; j < flag; j++) {
			sum = (long) (sum + Math.pow(aList.get(j), flag));
		}
		if(sum==num) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
