package programs;

public class MarkerInterface implements Cloneable {
	
	int a=10;
	int b=20;
	
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		
		MarkerInterface mi=new MarkerInterface();
		
		mi.a=100;
		mi.b=200;
		
		MarkerInterface mi2=(MarkerInterface) mi.clone();
		
		mi.a=500;
		mi.b=600;
		
		System.out.println(mi2.a);
		System.out.println(mi2.b);
		
				
		
	}

}
