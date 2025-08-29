package collections.practice;

import java.util.PriorityQueue;

public class PriorityQPractice {

	
	public static void main(String[] args) {
		
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		// addition of elements using offer and add function
		pq.add("Arjun");
		pq.offer("Pullalacheruvu");
		pq.add("Pullalacheruvu1");
		pq.offer("Pullalacheruvu2");
		// retrieve element 
		System.out.println(pq.peek());
		//removal using poll and remove funcitons
		pq.poll();
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		pq1.add(8);
		pq1.add(2);
		pq1.add(6);
		pq1.add(1);
		pq1.add(5);
		
		System.out.println(pq1);
		
		
	}
}
