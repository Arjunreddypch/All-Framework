package programs;

public class FunctionsChild implements Functions{

public void m1() {
		System.out.println("this is method m1");
	}

	public void m2() {
		System.out.println("this is method m2");
	}
	public void m3() {
		System.out.println("this is method m3");
	}
	
	public static void main(String args[]) {
		
		FunctionsChild fn=new FunctionsChild();
		
		fn.m1();
		fn.m2();
		fn.m3();
		Functions f=new FunctionsChild();
		f.m1();
		f.m2();
	}

	
}
