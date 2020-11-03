package keywords;

public class ThisKeyword {
	int a = 2;

	public void getData() {
		int a = 3;
		int b = this.a + a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword tkw = new ThisKeyword();
		tkw.getData();
		
	}

}
