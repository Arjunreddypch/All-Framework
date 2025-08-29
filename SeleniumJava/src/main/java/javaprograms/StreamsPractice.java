package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;


public class StreamsPractice {

	public static void main(String[] args) {

		// sending strings to arraylist and converting to streams
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("India Bharat ram");
		al.add("Australia ram");
		al.add("Dubai");
		al.add("Saudi ram");
		al.add("Beharin");
		al.add("USA ram");
		
		String text="Ram ram Ram Ram";
		List<String> l=Arrays.asList(text.split(" "));
		long count=al.stream().filter(a->a.contains("ram")).count();
		long count1=al.stream().filter(a->a.endsWith("a")).count();
		long count2=al.stream().filter(a->a.startsWith("B")).count();
		long count3=l.stream().filter(a->a.contains("R")).count();
		System.out.println("contains function"+count);
		System.out.println("ends with function"+count1);
		System.out.println("startsWith function "+count2);
		System.out.println("Ram count is "+count3);
		
		
		al.stream().filter(a->a.length()>4).limit(3).forEach(a->		
		{
			System.out.println(a);
			
		}
	);	
		
		List<String> li=Arrays.asList("testing","rahul","tutorial","from","rahuk","shetty","academy","rahua");
		//print name starts-with a and changed to uppercase and added limitation
		
		//
		Stream<String> newStream=Stream.concat(al.stream(), li.stream());
		li.stream().filter(k->k.startsWith("r")).map(s->s.toUpperCase()).sorted().limit(2).forEach(s->System.out.println(s));
//		newStream.forEach(s->System.out.println(s));
		boolean match=newStream.anyMatch(t->t.equalsIgnoreCase("from"));
		System.out.println(match);
		Assert.assertTrue(match);		
		
		// remove duplicated from Array and sorting values and printing using stream() collection
		List<Integer> values= Arrays.asList(1,5,7,23,4,6,9,0,7,4,54,35);		
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
