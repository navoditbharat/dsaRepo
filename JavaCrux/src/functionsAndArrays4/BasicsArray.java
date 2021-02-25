
package functionsAndArrays4;

/**
 * @author {Navodit Bharat}
 * @email Navoditbharat@ gmail.com
 */
public class BasicsArray {
	public static void main(String[] args) {
		
		int [] arr= null; // Declared an array
		System.out.println(arr); // Has no space yet
		
		arr = new int [5]; //Allocated Space
		System.out.println(arr); // Prints the base address of Array
		
//		Get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		Set
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
//		Get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		Print
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		Enhanced For loop for Arrays    Limitations.... 1. Forward only loop...... 2. Read only Loop
		for(int val : arr) {
			System.out.println(val);
		}
		
		
	}

}
