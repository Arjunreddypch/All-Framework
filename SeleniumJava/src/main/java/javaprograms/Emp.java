package javaprograms;

public class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
	// to sort integer array
	/*public int compareTo(Emp emp) {
		
		if(id==emp.id) {
			return 0;
		}
		else if(id>=emp.id) {
			return 1;
		}
		else {
			return -1;
		}*/
	
	// to sort String array
		 
public int compareTo(Emp emp) {
		
		return name.compareTo(emp.name);
		 
		
	}
	
	
		 
	

	
}
