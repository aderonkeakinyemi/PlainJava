package arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{11,4,5},
					{-10,-2,0},
					{1,2,-5}};
		
		//smallest number
		int smallest = a[0][0];
		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++ ) {
				if(a[i][j] < smallest) {
					smallest = a[i][j];
					
				}
			}
			
		}

		System.out.println("The smallest number is: "+smallest);
		// largest number
	int largest = a[0][0];
		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++ ) {
				if(a[i][j] > largest) {
					largest = a[i][j];
				}// end of if
			}//end of column
			
		}//end of row

		System.out.println("The Largest Number is: "+ largest);
		/*
			{{2,4,5},
			{3,4,0},
			{1,2,9}};
		*/
		
		//smallest number
				int small = a[0][0];
				int indexOfSmall = small;
				
				//finding the smallest number
				for(int i = 0; i<3; i++) 
				{
					for(int j =0; j<3; j++ ) 
					{
						if(a[i][j] < small) 
						{
							small = a[i][j];	
							indexOfSmall = j;
						}
					}
					
					//Finding the largest number from the column of the smallest number
				

				}
				
				int maxOfSmall = small;
				for(int i =0; i<3; i++) {
					for(int j = 0; j<3; j++) {
						if(j == indexOfSmall) {
							System.out.print(a[i][j] + " ");
							if(a[i][j] > maxOfSmall ) {
								maxOfSmall = a[i][j];
							}
						}
					}
				}
				System.out.println("The Smallest number is: " + small);
				System.out.println("The index of the smallest number is: " +indexOfSmall);
				System.out.println(maxOfSmall);
				System.out.println();
				
				// Optimised Baby
				int max = a[0][indexOfSmall];
				int k = 0;
				while(k < 3) 
				{
					System.out.println(a[k][indexOfSmall]);
					if(a[k][indexOfSmall] > max)
					{
						max = a[k][indexOfSmall];
					}
					k++;
				}
				System.out.println("The while max is: " + max);
	}

}
