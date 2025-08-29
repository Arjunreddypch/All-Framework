package javaprograms;

import java.util.Arrays;
import java.util.List;

public class ConvertStraingArrayToArrayList {
	
	public static void main(String[] args) {
		
		String list[]= {"car","bike","flight","train"};
		
		List<String> li=Arrays.asList(list);
		
		for(String l:li) {
			
			System.out.println(l);
		}
	}

}
