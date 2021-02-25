package javaIntroduction1;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Give maximum number");
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		scan.close();
		int y=1;
		int sum=0;
		int z=0;
		while(sum<=x) {
			System.out.println(sum);
			z=sum;
			sum=y+sum;
			y=z;
		}

	}

}