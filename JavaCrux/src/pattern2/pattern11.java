package pattern2;

public class pattern11 {
	public static void main(String[] args) {
	for(int row = 0;row<5;row++) {
		for(int col=0;col<9;col++) {
			if(col>=4-row && col<=4+row ) {
				if(row%2==0&&col%2==0) {
				System.out.print("*");
			} else if(row%2==1&&col%2==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}
}
