/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package array2D5;

import java.util.ArrayList;

public class ArrList1 {

	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		System.out.println(aList);

		aList.add(10);
		System.out.println(aList);
		System.out.println(aList.size());

		aList.add(20);
		System.out.println(aList);
		System.out.println(aList.size());

		aList.add(30);
		System.out.println(aList);
		System.out.println(aList.size());

		System.out.println("*************************");
		System.out.println(aList.get(2));

		System.out.println("*************************");

		aList.remove(0);
		System.out.println(aList);
		System.out.println(aList.size());
	}

}
