package javaprograms;

public class AnonymousinnerClass {

	Test t=new Test() {
		
	};
	public static void main(String[] args) {
		
		/*
		 * Thread t=new Thread() {
		 * 
		 * public void run() { System.out.println("this is anonumous inner class"); } };
		 * 
		 * t.start();
		 */
		AnonymousinnerClass ac=new AnonymousinnerClass();
		
		ac.t.m1();
		ac.t.m2();
		
	}
}
