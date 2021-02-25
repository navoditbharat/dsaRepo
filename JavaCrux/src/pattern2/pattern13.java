package pattern2;

public class pattern13 {

	public static void main(String[] args) {
		for(int row=0;row<9;row++) {
			for (int col=0;col<5;col++) {
				if (col<=row && row<5) {
					System.out.print("*");
				}else if(col<9-row&&row>=5) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}

}
