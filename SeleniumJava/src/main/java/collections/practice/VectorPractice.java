package collections.practice;

import java.util.Vector;

public class VectorPractice {
	
	
	public static void main(String[] args) {
		
		
		Vector<String> v=new Vector<String>();
		v.add("Arjun");
		v.add("Reddy");
		v.add("pullalacheruvu");
		
		Vector<String> v1=new Vector<String>();
		v1.add("Devansh");
		v1.add("Hi");
		
		v.addAll(v1);
		v.addAll(0,v1);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
