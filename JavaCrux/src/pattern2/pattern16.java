package pattern2;

public class pattern16 {

	public static void main(String[] args) {
		for(int row=0;row<9;row++) {
			for (int col=0;col<9;col++) {
				if(row<5) {
					if(col<4-row) {
						System.out.print(" ");
					}
					else if(col>=4-row && col<9-2*row) {
						System.out.print("*");
					}
				}
				else {
					if(col<row-4) {
						System.out.print(" ");
					}
					else if(col>=row-4 && col<=2*row-8) {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
			
			
			
			
			}
			}
}