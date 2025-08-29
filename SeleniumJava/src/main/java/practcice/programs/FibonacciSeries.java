package practcice.programs;

public class FibonacciSeries {

	
	static int temp;
	static int n1=0,n2=1;
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			
			temp=n1+n2;
			n1=n2;
			n2=temp;
			
			System.out.print(temp+" ");
			
					
			
		}
	}
	
	
}
