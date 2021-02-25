/**
 * author - Navodit Bharat
 * email - navoditbharat @ gmail.com
 */
package functionsAndArrays4;

public class ArrayBubbleSort {

	public static void main(String[] args) {

		int[] array = ArrayGodClass.getArray();

		int[] arraySorted = arrayBubbleSort(array);
		ArrayGodClass.displayArray(arraySorted);
	}

	public static int[] arrayBubbleSort(int[] array) {
		int flag = 0;
		for (int lo = 0; lo < array.length - 1; lo++) {
			for (int hi = 0; hi < array.length - flag - 1; hi++) {
				if (array[hi + 1] < array[hi]) {

					swappingInArrays.swap(array, hi + 1, hi);
				}
			}
			flag += 1;
		}

		return array;
	}

}
