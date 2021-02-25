package javaIntroduction1;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Give number you want to check for prime number for");
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		scan.close();
		int flag=0;
		int i=2;
		while(i<x) {
			if(x%i==0) {
				System.out.println("Composite number");
				flag=flag+1;
				break;
			}
			i=i+1;
		}
		if (flag==0) {
			System.out.println("Prime number");
		}
	}

}
