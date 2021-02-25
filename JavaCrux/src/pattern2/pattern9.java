package pattern2;

public class pattern9 {

	public static void main(String[] args) {
		for(int row = 0;row<5;row++) {
			for(int col=1;col<10;col++) {
				if(col>=5-row && col<=5+row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
