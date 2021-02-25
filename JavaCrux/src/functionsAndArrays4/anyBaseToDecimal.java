package functionsAndArrays4;

import java.util.Scanner;

/**
 * @author {Navodit Bharat}
 * @email Navoditbharat@ gmail.com
 */
public class anyBaseToDecimal {
	public static void main(String[] args) {
//		This code only works if one of base is 10
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give base of number you want to convert");
		int firstBase = scan.nextInt();
		System.out.println("Give number you want to convert");
		int firstNum = scan.nextInt();
		System.out.println("Give base you want to go to");
		int secBase= scan.nextInt();
		scan.close();
		
		convertFunction(firstBase,firstNum, secBase);
	}

	public static void convertFunction(int firstBase,int firstNum,int secBase ) {
		int BaseInc =1;
		int remainder = 0;
		int covtNumber=0;
		
		while(firstNum!=0){
			remainder = firstNum%secBase;
			firstNum= firstNum/secBase;
			remainder=remainder*BaseInc;
			covtNumber=remainder+covtNumber;
			BaseInc = BaseInc*firstBase;
		}
		System.out.println(covtNumber);
		
	}

}
