package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringProgram {

	public void m1(int a) {
		System.out.println("Int");
	}

	public void m1(float a) {
		System.out.println("Float");
	}

	public static void main(String[] args) {

		/*
		 * String s1 = new String("Spring"); s1.concat("fall");
		 * 
		 * String s2 = s1.concat("Winter"); s2.concat("Summer");
		 * 
		 * System.out.println(s1);
		 * 
		 * System.out.println(s2);
		 */

		/*
		 * StringProgram p = new StringProgram();
		 * 
		 * 
		 * p.m1(10); p.m1(10f); p.m1('a'); p.m1(10l);
		 */

		/*
		 * int i =1;
		 * 
		 * try { i++; }catch(Exception e) { i++; }finally { i++; }
		 * System.out.println(i);
		 */
		String s = "This is a test sentence, and this sentence is just a test this.";
		/*
		 * String s1[] = s.split(" "); int count = 1;
		 * 
		 * for (int i = 0; i < s1.length; i++) { for (int j = 0; j < s1.length; j++) {
		 * 
		 * s1[i]=s1[i].replaceAll(".*[.].*", "").toLowerCase().trim();
		 * s1[i]=s1[i].replaceAll(".*[,].*", "").toLowerCase().trim(); if
		 * (s1[i].equalsIgnoreCase(s1[j].toLowerCase()) && s1[i]!=s1[j] &&s1[i]!=) {
		 * count=count+1;
		 * 
		 * }
		 * 
		 * } System.out.println("The word " + s1[i] + " repeated " + count); count = 1;
		 * }
		 */
		
		
	String s1=s.replaceAll("\\.", "");
	String s3=s1.replaceAll("\\,", "");
	String s2[]=s3.split(" ");
	ArrayList<String> al=new ArrayList<String>(Arrays.asList(s2));
	
	Set<String> set=new HashSet<String>();
	
	for(int i=0;i<s2.length;i++) {
		set.add(s2[i]);
	}
	Iterator<String> it=set.iterator();
	long count=0;
	while(it.hasNext()) {
		System.out.println(it.next());
		 count=al.stream().filter(t->t.toString().toLowerCase().equalsIgnoreCase(it.next().toLowerCase())).count();
		 System.out.println(it.next()+" count is "+count);
		 count=0;
	}
	
	}

}
