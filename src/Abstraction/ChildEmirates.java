package Abstraction;

public class ChildEmirates extends ParentAircraft{
	
	public static void main (String[] args) {
		
		ChildEmirates Emir = new ChildEmirates();
		Emir.bodyColour();
		Emir.engine();
		
		
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("My favorite colour is green, because that is the colour of the US dollar");
	}

}
