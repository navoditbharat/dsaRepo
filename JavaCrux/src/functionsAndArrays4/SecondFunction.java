package functionsAndArrays4;

public class SecondFunction {
	public static int val=20; // Global Variable
	
	public static void main(String[] args) {
		//		Part 1 - Main function
		
		System.out.println("Hello");
		int x = 30;// Local Variables for main function
		int y = 50;
		int sum = addition(x,y); // Value returned gets replaced by the function here 
		System.out.println(sum);
		System.out.println("Bye!!");
		GlobalVarScope();
		BlockScopeExample();
		System.out.println(x+ " "+ y); // Printing values of x and y before calling swap function
		swap(x,y);
		System.out.println(x+ " " + y); // Printing values of x and y after calling swap function. Swap function , however , has no effect in the main function this way.

	}

	
	public static int addition(int x, int y) {
		
		//		Part 2 - Learning Functions with Parameters and Return Type
		
		int z= x + y; // These x and y here are local variables for addition function. Any function outside doesn't know about them. And Addition() function doesn't know about the x and y variables in main function.
		return z; 
	}
	
	
	public static void GlobalVarScope() {
		
		//		Part 3 - Understanding Global Variables, Local Variables and their Scope
		
		System.out.println(val); // Global Variable is always stored in Heap. This line of code took value from heap as it couldn't find Val named variable in Stack or locally.
		int val = 200;  // Value of Val got stored in stack.
		System.out.println(val); // Here our code took local value of Val available in GlobalVarScope function. In Local vs Global Fight the local always wins.
		System.out.println(SecondFunction.val); // Here we told our compiler to take the value of Val from Heap i.e. Global Variable

		//		No return needed as this function is Void return type		
	}
	
	
	public static void BlockScopeExample() {
		
//		Part 4 - Block Scope of Variables
		
		int c = 10;
		int d =20 ;
		if (c<d) { int blockVar = 10; System.out.println(blockVar); }  // Since the blockVar only gets created inside the IfElse block it is not accessible outside the block.  
		//	System.out.println(blockVar) throws error here because blockVar is not accessible outside the If Else block
	}
	
	
	public static void swap(int x , int y) {
		
//		Part 5 - Checking if this swap function is able to swap values in main function or not
		
		int z = y;
		y=x;
		x=z;
		System.out.println(x + " "+ y);
	}
}
