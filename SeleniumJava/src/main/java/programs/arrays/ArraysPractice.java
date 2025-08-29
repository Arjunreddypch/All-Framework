package programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraysPractice {
	
	public static void main(String args[]){
		
			
		
		int a1[]= {1,4,5,2,9,9,5,6,7,3,5,5,7,8,9,3,9,9,9};
		
		System.out.println(a1.length);
		
		System.out.println(Arrays.toString(a1));
		
		//copy values from one array to another array
		
		int a2[]=new int[a1.length];
		
		System.arraycopy(a1, 0, a2, 0, a1.length);
		
		System.out.println(Arrays.toString(a2));
		
		// finding index of element in array
		
		int indexOfElement=Arrays.binarySearch(a2, 9);
		System.out.println(indexOfElement);
		
		//sorting arrays
		
		Arrays.sort(a2);
		
		System.out.println(Arrays.toString(a2));
		
		// removing duplicates from array
		
		Set<Integer> removeDuplicates=new HashSet<>();
		
			for(int a:a2) {
				removeDuplicates.add(a);
			}
			Iterator<Integer> it=removeDuplicates.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
				System.out.println("");
			}
			
		// print duplicates numbers using array
			
			int count=1;
			int duplicateElement=0;
			for (int i=0;i<a1.length;i++) {
				//{1,4,5,2,5,6,7,3,5,7,8,9,3};
				for(int j=0;j<a1.length;j++) {
					
					if(a1[i]==a1[j] && i!=j && a1[i]!=99) {
						
						count=count+1;
						duplicateElement=a1[i];
						a1[j]=99;
					}
				}
					if(count>1) {
						System.out.println(duplicateElement+" is duplicated in array and count "+count+" times");
					}
					a1[i]=99;
					count=1;
			}
	}

}
