package collections.practice;

import java.util.Stack;

public class StackPractice {
	
	public static void main(String[] args) {
		
		
		/*
		 * LIFO- Stack is LIFO- Last in First Out
		 * FIFO- Queue First in First Out 
		 * 
		 */
		
		Stack<String> sk=new Stack<String>();
		
		sk.add("Arjun");
		sk.add(0, "Pullalacheruvu");
		sk.addLast("Reddy");
		sk.addLast("P");
		sk.add(null);
		sk.set(4, "replacing null");
		System.out.println(sk.peek());// search the last element added to stack
		System.out.println(sk.push("Hi"));// adds HI to stack
		System.out.println(sk.peek());//search the last element added to stack
		System.out.println(sk.pop());// remove last stored element in stack
		System.out.println(sk.search("Reddy"));//returns index of string
		
		
	}

}
