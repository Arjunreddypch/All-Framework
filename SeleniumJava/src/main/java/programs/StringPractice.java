package programs;

public class StringPractice {

	
	public static void main(String[] args) {
		
		
		String s="HI";
		String s1=new String("HI");
		String s2=new String("HI");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		String s3="HI";
		System.out.println(s.hashCode()+" Matching hashcodes "+s3.hashCode());
		System.out.println(s==s3);
		
		
	}
}
