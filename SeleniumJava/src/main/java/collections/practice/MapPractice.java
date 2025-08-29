package collections.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		
		map.put(123, "Arjun");
		map.put(456, "Reddy");
		map.put(789, "Pullalacheruvu");
		map.put(null, "Hi");
		
		System.out.println(map.get(null)+"Hi");
		//printing values approach using for each loop
		Set<Integer> it=map.keySet();
		for(Integer i:it) {
			System.out.println(map.get(i));
		}
		
		//printing values approach using iterator
		
		Iterator<Integer> iterator=it.iterator();
		
		while(iterator.hasNext()) {
			
			//print values
			System.out.println(map.get(iterator.next()));
		}
		
		//printing both keys at time values using entrySet
		
		Set<Entry<Integer, String>> keyValues = map.entrySet();
		Iterator<Entry<Integer, String>> it1=keyValues.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next()+" ");
		}
		
		//printing both keys and values using entrySet
		 keyValues = map.entrySet();
		
		 for(Entry<Integer, String> kv:keyValues) {
			 
			 System.out.println(kv.getKey()+">>>>>>"+kv.getValue());
		 }
		
		
	}
	
	
}
