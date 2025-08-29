package practcice.programs;

public class PrintDiamond {

	public static void main(String args[]) {

		int number = 6;

		for (int i = 1; i < number; i++) {

			for (int j = 1; j <= number-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=number;i>0;i--) {
			
			for(int j=i;j<number;j++) {
				
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++) {
				
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
		

	}
}
