package practcice.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CheckOwelIsPresentInString {

	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		
		String name="Hi ArjunuuiiskdAAADDDfshlsi0u";
		
		int count=0;
		for(int i=0;i<name.length();i++) {
			System.out.println(name.substring(i,i+1));
			if(name.substring(i,i+1).matches(".*[aeiou].*")) {
				
								
				if(hashmap.get(name.substring(i,i+1))==null) {
					hashmap.put(name.substring(i,i+1), count+1);
				}
				else {
					hashmap.put(name.substring(i,i+1), hashmap.get(name.substring(i,i+1))+1);
				}
				
			}
			
			}
		
		System.out.println(hashmap.get("i"));
		
	}
}
