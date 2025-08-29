package practcice.programs;

public class ReverseAString {

	
	public String reverseAString(String text) {

		char[] c=text.toCharArray();
		String reverse="";
		for(int i=c.length-1;i>=0;i--) {
			reverse=reverse+c[i];
		}
		return reverse;
	}
	
	public String reverseAStringUsingBuffer(String text) {
		
		StringBuffer sb=new StringBuffer(text);
		text=sb.reverse().toString();
		
		return text;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ReverseAString rev=new ReverseAString();
		System.out.println(rev.reverseAString("Arjun"));
		System.out.println(rev.reverseAStringUsingBuffer("Reddy"));
	}
}
