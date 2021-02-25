package javaIntroduction1;
import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your age?");
		int age= scanner.nextInt();
		scanner.close();
		if(age<15) {
			System.out.println("Hey Kid");
		}else if(age<18) {
			System.out.println("You are teen");
		}else {
			System.out.println("How's life treating you huhuhhuhuh?");
		}

	}

}
