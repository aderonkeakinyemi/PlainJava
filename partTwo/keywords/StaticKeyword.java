package keywords;

//Census in Ibadan
public class StaticKeyword {
	private static final String ii = null;
	//Instance variables 
	String name;
	String address;
	String city = "Bangalore"; // all static variables are class variables
	int i = 0;
	static String Ccity = "Ikeja";
	static int odo = 0;

/*	
	static {
		String Ccity = "Ikeja";
		int ii = 0;
				
	}
	
*/
	StaticKeyword(String name, String address) {
		this.name =  name;
		this.address = address;
	}
	
	public void getAddress() {
		System.out.println(address + ", "+ city + "."); 
	}
	
	public void getCity() {
		System.out.println(city);
	}
	
	public static void getCcity() {
		System.out.println(Ccity);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticKeyword sk =  new StaticKeyword("Aderonke","Bashorun");
		StaticKeyword sk2 =  new StaticKeyword("Oyindamole","Akobo");
		StaticKeyword sk3 =  new StaticKeyword("Oyindamole","Akobo");
		sk.getAddress();
		sk2.getAddress();
		sk3.getAddress();
		StaticKeyword.getCcity();
		System.out.println(StaticKeyword.Ccity);
	
		
		
	}



}
