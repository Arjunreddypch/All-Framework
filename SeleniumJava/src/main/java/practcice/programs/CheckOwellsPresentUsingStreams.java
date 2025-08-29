package practcice.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckOwellsPresentUsingStreams {

	public static void main(String[] args) {
		String name="Hi ArjunuuiiskdAAADDDfshaiil456454si0u";
		char c[]=name.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<c.length;i++) {
			al.add(c[i]);
		}
		
		/*
		 * //al.stream().filter(s->s.toString().toLowerCase().matches(".*[s].*")).
		 * forEach(s->System.out.println(s));
		 * 
		 * List<Character>
		 * list=al.stream().filter(s->s.toString().toLowerCase().matches(".*[aeiou].*"))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(list.stream().filter(s->s.toString().toLowerCase().matches
		 * (".*[i].*")).count());
		 */
		
		List<Character> owels=al.stream().filter(s->s.toString().matches(".*[a-zA-Z0-9].*")).collect(Collectors.toList());
		List<Character> removeDuplicates=al.stream().distinct().collect(Collectors.toList());
	
		System.out.println(owels.stream().filter(s->s.toString().matches("A")).count());
		
		
			
	}

}
