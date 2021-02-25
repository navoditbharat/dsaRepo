/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class ManmohanLovesPatternOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
		
		for (int curRow= 0 ; curRow < rows ; curRow++) {
				
				if(curRow%2==0) {
					oddPattern(curRow);
					
				}
				else {
					evenPattern(curRow);
				}
				System.out.print("\n");
		}
		
	}

	private static void oddPattern(int curRow) {
		
		for (int currentCol=0; currentCol <= curRow; currentCol++) {
			System.out.print("1");
		}
		
	}

	private static void evenPattern(int curRow) {
		
		for (int currentCol=0; currentCol <= curRow; currentCol++) {
				if(currentCol==0 || currentCol==curRow) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
		}
		
	}

}
