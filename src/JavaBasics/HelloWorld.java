package JavaBasics;

public class HelloWorld {


	
	public void getData() {
		System.out.println("I am a programmer");
	}
	static int a = 5;
	static String name = "Aderonke";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hi");
		System.out.print("Hi");
		System.out.println("Bi");
		System.out.print(a);
		HelloWorld h = new HelloWorld();
		h.getData();
		String fname = h.name;
		
		Classtwo two = new Classtwo();
		two.setData();
		
		String myname = new String("Aderonke");
		System.out.println(myname);

	}

}
