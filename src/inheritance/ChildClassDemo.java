package inheritance;

public class ChildClassDemo extends ParentClassDemo {

	
	public void engine(int a) {
		System.out.println("Engine a");
	}
	
	public void engine(int b, int d) {
		System.out.println("Engine b, d");
	}
	
	
	public void colour() {
		System.out.println("black and yellow");
	}
	
	public void breaks() {
		System.out.println("Gear is dope");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClassDemo pcd = new ParentClassDemo();
		ChildClassDemo ccd =  new ChildClassDemo();
		pcd.breaks();
		ccd.colour();
		ccd.engine(5);
		ccd.engine(5, 8);
	}

}
