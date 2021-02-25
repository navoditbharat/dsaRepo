package nsANDdt3;

import java.util.Scanner;

public class vonNeumanBinary {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] arr = null;
		int n = scan.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		for (int j=0;j<n;j++) {
			
			arr[j]=decimalToBin(arr[j]);
			System.out.println(arr[j]);
		}
		
		
	}

	public static int decimalToBin(int input) {
		int remainder;
		int binaryIncrement=1;
		int covtNum=0;
		while (input!=0) {
			remainder= input%10;
			input=input/10;
			covtNum= (remainder*binaryIncrement)+covtNum;
			binaryIncrement= binaryIncrement*2;
		}
		return covtNum;
	}
}
