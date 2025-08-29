package programs;

public class Child extends Parent {

	public void sum() {

		System.out.println("this is child class sum method");
	}

	public void specificMethod() {
		System.out.println("Child specific method");
	}

	public Child() {
		System.out.println("this is child class constructor");
	}

	public Child(String c) {
		super(c);
		System.out.println("this is child class constructor with one param");

	}

	public static void main(String[] args) {

		/*
		 * Parent t=new Child();
		 * 
		 * t.sum();
		 */

		/*
		 * Child c = (Child)new Parent();//Child c = new Child();
		 * 
		 * c.sum();
		 */

		/*
		 * Child c = new Child(); c.sum(); c.specificMethod();
		 * 
		 * System.out.println("****************************************");
		 * 
		 * Parent p = new Parent();
		 * 
		 * p.sum();
		 * 
		 * System.out.println("****************************************"); Parent p1 =
		 * new Child();
		 * 
		 * p1.sum();
		 */

		Child c2 = new Child("Java");
		
		Child c3 = new Child();

	}
}