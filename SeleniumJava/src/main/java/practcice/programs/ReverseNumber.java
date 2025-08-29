package practcice.programs;

public class ReverseNumber {

	
	
	public static void main(String[] args) {
		
		int number=12345;
		
		int reverse=0;
		int rem;
			while(number>0) {
				
				rem=number%10;
				reverse=(reverse*10)+rem;
				number=number/10;
				System.out.println(reverse);
			}
	}
}
