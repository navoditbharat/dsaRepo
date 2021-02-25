/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package nsANDdt3;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
//		ax^2+bx+c=0
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		int d = b*b - 4*a*c;
		
		int r1= (int) (-b+ Math.sqrt(d))/ (2*a);
		int r2 = (int) (-b- Math.sqrt(d))/ (2*a);
		
		if(r2>r1) {
			int temp = r1;
			r1=r2;
			r2=temp;
		}    // I assumed r1 is  always greater than r2
		
		if (d<0) {
			System.out.println("Imaginary");
		}else if(d==0){
			System.out.println("Real and Equal");
			System.out.println(r1);
			System.out.println(r2);
		}else {
			System.out.println("Real and Distinct");
			System.out.println(r2);
			System.out.println(r1);
		}

	}

}
