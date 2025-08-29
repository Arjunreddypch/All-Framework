package javaprograms;

public class StringExamples {

	
	
	public static void main(String[] args) {
		
		
		String s1="Arjun";
		String s2="Reddy";
		String s3="Arjun";
		
		String s4=new String("Arjun");
		String s5=new String("Reddy");
		String s6=new String("Arjun");
		
		System.out.println(s1==s3);//true
		System.out.println(s1==s2);//false
		System.out.println(s1==s4);//false
		System.out.println(s2==s5);//false
		//immutable nature //modifications are not allowed
		 s1.concat(s2);
		System.out.println(s1);//Arjun
		StringBuffer sb1=new StringBuffer("Arjun");
		StringBuffer sb2=new StringBuffer("Reddy");
		//mutable nature //modifications are allowed
				sb1.append(sb2);
		System.out.println(sb1);//ArjunReddy
		
		
		
	}
}
