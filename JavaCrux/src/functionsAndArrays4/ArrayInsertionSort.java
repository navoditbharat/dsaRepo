/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class ArrayInsertionSort {

	public static void main(String[] args) {

		int[] arr = ArrayGodClass.getArray();

		int[] arraySorted = arrayInsertionSort(arr);

		ArrayGodClass.displayArray(arraySorted);

	}

	public static int[] arrayInsertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {
			int val = arr[counter]; // value of current counter saved

			int revCounter = counter - 1;

			while (revCounter > 0 && val < arr[revCounter]) {
				arr[revCounter + 1] = arr[revCounter];
				revCounter--;
			}
			arr[revCounter + 1] = val;
		}

		return arr;
	}

}
