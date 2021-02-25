/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int side = scan.nextInt();
		scan.close();
		
		rhombusPattern(side);

	}

	public static void rhombusPattern(int side) {
		
		int column = 2*side - 1;
		for (int row=0; row < side;row++) {
			for (int tempCol=0; tempCol<column-row;tempCol++) {
				
				if (tempCol> side-row-2) {
					if(row==0 || row==side-1) {
					System.out.print("*");
					}else if(tempCol==side-row-1 || tempCol==column-row-1) {
						System.out.print("*");
					}else {
						 System.out.print(" ");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		
	}

}
