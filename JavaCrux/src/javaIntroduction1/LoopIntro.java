package javaIntroduction1;
import java.util.Scanner;

public class LoopIntro {

	public static void main(String[] args) {
		int flag = 1;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Give value of N so that we can find value of Sum till N");
		int x = scanner.nextInt();
		scanner.close();
		while(flag<=x) {
			sum= flag+sum;
			flag=flag+1;
		}
		System.out.println("The Sum is "+sum);
	}

}
