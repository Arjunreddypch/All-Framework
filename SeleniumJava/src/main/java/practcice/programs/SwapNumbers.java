package practcice.programs;

public class SwapNumbers {
	
	int a=10, b=20;
	
	public void SwapNumbers(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		
	}
	public static void main(String[] args) {
		
		SwapNumbers swap=new SwapNumbers();
		swap.SwapNumbers(swap.a, swap.b);
	}
	
	

}
