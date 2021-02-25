/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class ArraySelectionSort {

	public static void main(String[] args) {
		int[] arr = ArrayGodClass.getArray();
		int[] arraySorted = arraySelectionSort(arr);
		ArrayGodClass.displayArray(arraySorted);
	}

	public static int[] arraySelectionSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int secCount = counter + 1; secCount < arr.length; secCount++) {
				if (arr[counter] > arr[secCount]) {
					swappingInArrays.swap(arr, counter, secCount);
				}
			}
		}

		return arr;
	}

}
