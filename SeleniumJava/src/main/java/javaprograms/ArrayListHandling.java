package javaprograms;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListHandling {

	public void arrayListPractice() {
ArrayList<String> al=new ArrayList<String>();
		
		al.add("Arjun");
		al.add("Reddy");
		al.add("Pullalacheruvu");
		al.add(0, "Mr");
		al.addLast("Bye");
		al.addFirst("Hi");
		al.removeLast();
		al.remove("Hi");
		for(String a:al) {
		System.out.println(a);	
		}
		
		System.out.println(al.contains("Mr"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(456, "Dear reddy"));
		al.add(new Emp(823, "Arjun"));
		al.add(new Emp(789, "Pullalacheruvu"));
		Collections.sort(al,new EidComparator());
		
		for(Emp a:al) {
			
			System.out.println(a.id+""+a.name);
		}
		Collections.sort(al,new EnameComparator());
        for(Emp a:al) {
			
			System.out.println(a.id+""+a.name);
		}
	}

}
