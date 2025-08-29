package practcice.programs;

public class ArraysHandling3 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Object obj[]=new Object[3];
		
		obj[0]=new ArraysHandling(123, "Arjun");
		obj[1]=new ArraysHandling2(1, "Reddy");
		obj[2]=new String("HI");
		
		for(Object o:obj) {
			
			if(o instanceof ArraysHandling) {
				
				ArraysHandling a=(ArraysHandling)o;
				
				System.out.println(a.id);
				System.out.println(a.name);
			}
			if(o instanceof ArraysHandling2) {
				ArraysHandling2 a2=(ArraysHandling2)o;
				System.out.println(a2.id+"------"+a2.name);
				
			}
			if(o instanceof String) {
				System.out.println(o);
			}
		}
		
	}
	
	

}
