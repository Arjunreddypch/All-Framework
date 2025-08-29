package collections.practice;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		
		//valid scenario
		List<String> list=new LinkedList<String>();
		
		list.add("Arjun");
		list.add(0, "Pullalacheruvu");
		list.add("Arjun");
		list.add(null);
		
		for(String li:list) {
			System.out.println(li);
		}
		
		
		
		
		
		
	}

}
