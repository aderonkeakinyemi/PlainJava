package InterfacesClasses;

public class AustralianTraffic implements CentralTrafficRules, AfricanTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTrafficRules AT = new AustralianTraffic();
		AustralianTraffic ATT = new AustralianTraffic();
		AT.green();
		ATT.black();
		ATT.holdup();
		

	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Green Light");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Light");
		
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Red Light");
		
	}
	
	public void black() {
		System.out.println("Black");
	}

	@Override
	public void holdup() {
		// TODO Auto-generated method stub
		System.out.println("Hollup");
	}

}
