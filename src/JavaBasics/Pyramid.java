package JavaBasics;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//for loop basic
			int r = 1;
			for(int l = 0; l <=3; l++) {
				for(int m =0; m<=3; m++) {
					System.out.print( "* ");
					//r++;
					
				}
				System.out.println(" ");
			}
			System.out.println(" ");
	
			//pyramid
			int s = 1;
			for(int l = 0; l <=3; l++) {
				for(int m = 0; m<=3-l; m++) {
					System.out.print(s + " ");
					s++;
					
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			//inverted pyramid
			int t = 1;
			for(int l = 1; l <=4; l++) {
				for(int m = 1; m<=l; m++) {
					System.out.print(t + " ");
					t++;
					
				}
				System.out.println(" ");
			
			}
			
			System.out.println(" ");
			
			for(int l = 1; l <=4; l++) {
				for(int m = 1; m<=l; m++) {
					System.out.print(m+ " ");	
				}
				System.out.println(" ");
			
			}
			System.out.println(" ");
			int q = 3;
			for (int i = 1; i<=3; i++) {
				for(int j =1; j<=i ; j++) {
					System.out.print(q + " ");
					q+=3;
				}
				System.out.println();
			}
			
			
	}
	

}
