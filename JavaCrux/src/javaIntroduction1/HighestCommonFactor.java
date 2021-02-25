package javaIntroduction1;
import java.util.Scanner;

public class HighestCommonFactor {

	public static void main(String[] args) {
		System.out.println("Give two numbers to find HCF");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(),y=scan.nextInt();
		scan.close();
		int i=0;
		if (x<y) {
			while(y%x!=0) {
				i=y%x;
				y=x;
				x=i;
			}System.out.println(x);
		}else {
			while(x%y!=0) {
				i=x%y;
				x=y;
				y=i;
			}System.out.println(y);
		}
	}

}
