package practcice.programs;

public class ArraysHandling {
	int id;
	String name;
	public static void main(String[] args) {
		System.arraycopy(args, 0, args, 0, 0);
		
		int i[]= {1,2,3,4,5};
		int i1[] = new int[5];
		System.arraycopy(i, 0, i1, 0, i1.length);
		
		for(int i2:i1) {
			System.out.println(i2);
		}
		
		int j[]=new int[10];
		
		int k[] = null;
		
		for(int ii:k) {
			System.out.println(ii);
		}
	}
	
	public ArraysHandling(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}

}
