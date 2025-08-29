package programs;

public  class FunctionsChild2 extends FunctionsChild1 implements Functions{

	
	public void m2() {
		System.out.println("method m2");
		
	}
	
	public static void main(String[] args) {
		
		
		FunctionsChild2 fn=new FunctionsChild2();
		
		fn.m1();
		fn.m2();
		
	}



	
}
