package nsANDdt3;

import java.util.Scanner;

/**
 * @author {Navodit Bharat}
 * @email Navoditbharat@ gmail.com
 */
public class simpleInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int newNum=0;
		while(sum>=0){
			newNum = scan.nextInt();
			sum=sum+newNum;
			if(sum>=0){
				System.out.println(newNum);
			}
		}
		scan.close();
		
    }
}
