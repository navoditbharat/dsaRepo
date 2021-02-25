package functionsAndArrays4;

import java.util.Scanner;

public class firstFun {

	public static void main(String[] args) {
//		Part 1
		System.out.println("Hello");
		addition();
		System.out.println("Bye!!");
	}

	private static void addition() {
//		Part 2
		System.out.println("World!!");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int z=x+y;
		System.out.println(z);
	}
	

}
