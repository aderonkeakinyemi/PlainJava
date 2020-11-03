package JavaBasics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(4 < 10) 
		System.out.println("yes!");
		else 
			System.out.println("no");

		System.out.println("I'm out");
		
		for(int i =0; i < 10; i+= 2) {
			if(i ==9) 
				System.out.print("8 is displayed");
			else
			System.out.println("There was no eight");
			
		}
		
		for(int i =5; i<=3; i++) {
			System.out.print(i);
		}
		
		
		// While loop
		int i = 10;
		while(i > 0) {
			System.out.print(i);
			i--;
		}
		
		//DO while loop
		int j = 1;
		do {
			System.out.print(i+=2);
		}
		while(i<1);
		System.out.println();
		
		//Nested for loop
		for(int a =1; a <=4; a++) { // outer loop will run 4 times
			System.out.println("outer loop started");
			for(int b =1; b<=4; b++) {
				System.out.print("Inner loop");
			}
		} System.out.println("outer loop finished");
		
	}

}
