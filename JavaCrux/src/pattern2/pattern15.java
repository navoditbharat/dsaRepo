package pattern2;

public class pattern15 {

	public static void main(String[] args) {
		for(int row=0;row<9;row++) {
			if(row<5) {
			for (int col=0;col<5+row;col++) {
				if(col<2*row) {
					System.out.print(" ");}
				else{System.out.print("*");}
				}
			}
			else {
				for (int col=0;col<13-row;col++) {
					if(col<=15-2*row) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					}				
			}
			System.out.print("\n");
		}
}
}