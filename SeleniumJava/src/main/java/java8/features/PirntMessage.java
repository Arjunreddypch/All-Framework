package java8.features;

public class PirntMessage {
	
	public static void main(String[] args) {
		
		IPrintable print=new IPrintable() {
			
			@Override
			public void printValue() {
				System.out.println("I am printing vlaues here");
			}
		};
		print.printValue();
		
		
		// 1. parameter should match from interface
		//2. return type should match
		//3. only one abstract method should be there
		IPrintable print2=()-> {System.out.println("this is lambda expression");
								System.out.println("this is second line");	};
		
		print2.printValue();
		
	}
}
