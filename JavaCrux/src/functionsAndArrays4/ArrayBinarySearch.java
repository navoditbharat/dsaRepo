/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

import java.util.Scanner;

public class ArrayBinarySearch {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Binary Search Can only be applied to PreSorted Array
		
		int[] arrayBin = {10, 20 , 30 , 40 , 50 , 60};
		arrayBinarySearch(arrayBin);
	}

	public static void arrayBinarySearch(int[] arrayBin) {
		
		System.out.println("Give value you want to search?");
		int val= scan.nextInt();
		int last = arrayBin.length-1;
		int first = 0;
		int flag = 0;
		
		while(first<=last) {
			int mid = (first+last)/2 ;
			if (val < arrayBin[mid]) {last = mid-1;}
			else if (val> arrayBin[mid]){ first = mid+1;	}
			else {System.out.println("The index is "+ first); flag=1; break;}
		}
		if (flag==0){
		System.out.println("Not Found");
		}
	}
		
}
