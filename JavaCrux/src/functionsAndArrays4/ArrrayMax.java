/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class ArrrayMax {

	public static void main(String[] args) {

		int[] arr = ArrayGodClass.getArray();

		int maxOfArray = maxArray(arr);

		System.out.println("Max of Array is" + maxOfArray);
	}

	public static int maxArray(int[] arr) {
		int prevVal = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (prevVal < arr[i]) {
				prevVal = arr[i];
			}
		}
		return prevVal;
	}

}
