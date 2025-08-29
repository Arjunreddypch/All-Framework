package javaprograms;

import java.util.Comparator;

public class EidComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		
		if(e1.id==e2.id) {
			return 0;
		}
		else if(e1.id>e2.id){
			return 1;
		}
		else
		return -1;
	}

	
	
	

}
