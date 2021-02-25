package javaIntroduction1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		scanner.close();
	}
		

}
