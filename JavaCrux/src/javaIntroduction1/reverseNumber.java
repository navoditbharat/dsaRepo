package javaIntroduction1;
import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		System.out.println("Give number you want to reverse");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int i=10;
		int x,rem=0;
		while(number!=0) {
			 x =number%i;
			 number=number/i;
			 rem=x+rem*10;		
			 }
		 System.out.println(rem);
	}
	
}