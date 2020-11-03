package Abstraction;

public abstract class ParentAircraft {

	// This is a none absract method
	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}
	
	private void safetyGuidelines() {
		System.out.println("Follows safety guidelines");
	}
	
	//This is an abstract method because there is no implementation-implementation is hidden
	public abstract void bodyColour();
		
	}

