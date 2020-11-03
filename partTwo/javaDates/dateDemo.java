package javaDates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat sdgf = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sdgf.format(d));
		

	}

}
