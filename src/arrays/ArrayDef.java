package arrays;

public class ArrayDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4; // single variable
		int b[] = new int[5];  // declares an array and allocate memory for the values: Method 1
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		
		for(int i = 0; i <b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		int c[] = {4,2,3,4,5};
		for(int i = 0; i <c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		int m[][] = new int[2][2];
		m[0][0] = 2;
		m[0][1]= 3;
		m[1][0] = 4;
		m[1][1] = 5;
		
		System.out.println(m[1][0] + "*");
		
		for(int i = 0; i<m.length; i++) {
			for(int j  = 0; j<m.length; j++) {
				System.out.println(m[i][j]);
			}
		}
		
		System.out.println();
		
		int n[][] = {{2,3}, {4,5}, {5,6}};
		for(int i = 0; i<3; i++) {
			for(int j  = 0; j<2; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
