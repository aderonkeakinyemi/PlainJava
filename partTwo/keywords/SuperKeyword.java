package keywords;

import inheritance.ParentClassDemo;

public class SuperKeyword extends ParentClassDemo{
	
	public SuperKeyword()
	{
		super();
		System.out.println("child class constructor");
	}
	
	String name = "Ekron";

	public void getString() {
		//System.out.println(super.name);
		System.out.println(name);
	}
	
	public void getData() {
		super.getData();
		//System.out.println("I am in the child's class");
	}
	public static void main(String[] args) {
		SuperKeyword skw = new SuperKeyword();
		skw.getString();
		skw.getData();
		
		
	}
}
