package javaprograms;

import java.util.Comparator;

public class EnameComparator implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2){
		
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		
		return e1.name.compareTo(e2.name);
	}
}
