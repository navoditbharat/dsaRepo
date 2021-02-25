package nsANDdt3;

import java.util.Scanner;

public class takeCharInput {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in); 
		  char charac = scan.next().charAt(0);
		  System.out.println(charac);
		  scan.close();
}

}
