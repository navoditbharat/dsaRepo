package javaIntroduction1;
import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		int amount;
		int rate;
		int time;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give Amount");
		amount=scanner.nextInt();
		System.out.println("Give rate");
		rate = scanner.nextInt();
		System.out.println("Give time");
		time= scanner.nextInt();
		scanner.close();
		float interest = amount*rate*time/100;
		System.out.println(interest);
	}

}
