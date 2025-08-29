package collections.practice;

import java.util.ArrayList;
import java.util.Collections;

public class AlPractice {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(30);
		al.addLast(40);
		al.add(0,100);
		al.add(0,100);
		al.addFirst(20);
		System.out.println(al.size());
		al.isEmpty();
		al.contains(100);
		al.get(3);
		al.add(null);
		for(Integer a:al) {
			
			System.out.println(a);
		}
		
		Collections.synchronizedList(al);
	}

}
