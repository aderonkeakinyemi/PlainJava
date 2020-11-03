
public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 7;
		int c = 0;
		int k;
		try
		{
		 k = b/c;
		 System.out.println(k);
		} 
		catch(Exception e)
		{
			System.out.println("oops");
		}
		finally
		{
		System.out.println("SMile");	
		}
		
		

	}

}
