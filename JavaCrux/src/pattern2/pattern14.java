package pattern2;

public class pattern14 {

	public static void main(String[] args) {
		for(int row=0;row<9;row++) {
			for (int col=0;col<5;col++) {
				if (col>=4-row && row<5) {
					System.out.print("*");
				}else if(col>row-5&&row>=5) {
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
