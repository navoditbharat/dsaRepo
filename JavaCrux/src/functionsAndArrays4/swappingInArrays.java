/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class swappingInArrays {

	public static void main(String[] args) {

		int[] array = null;
		array = new int[5];
		array[1] = 10;
		array[2] = 20;
		array[0] = 0;
		array[3] = 30;
		array[4] = 40;

//		int [] arr = {100,200,300,400,500};

		System.out.println(array);

		System.out.println(array[1] + " " + array[2]);
		swap(array[1], array[2]);

		System.out.println(array[1] + " " + array[2]);

		swap(array, 1, 2);

		System.out.println(array[1] + " " + array[2]);

	}

	public static void swap(int one, int two) {

//		Part 1 - Checking if this swap function is able to swap values in main array or not

		int z = one;
		one = two;
		two = z;
//		System.out.println(one+ " "+ two);
//		Non working Swap
	}

	public static void swap(int[] arr, int i, int j) {

//		Part 2 - Checking if this swap function is able to swap values in main array or not

		int z = arr[i];
		arr[i] = arr[j];
		arr[j] = z;
//		System.out.println(arr[i] + " "+ arr[j]);
//		Working Swap   ... When we give array as input to any method it takes reference to base memory location of array 
	}

}
