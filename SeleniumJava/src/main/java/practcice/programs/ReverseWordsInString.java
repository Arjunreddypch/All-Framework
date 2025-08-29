package practcice.programs;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String text = "Hi I am Tester in the World";

		String valuesToArray[] = text.split(" ");

		
		 // Reverse a string 
		
		String reverseString ="";
		  
		  for (int i = valuesToArray.length - 1; i >= 0; i--) {
		  
		  reverseString = reverseString + " " + valuesToArray[i];
		  
		  } System.out.println(reverseString.trim());
		 

		
		 // Reverse a string using String Builder 
		StringBuilder builder = new StringBuilder();
		  
		  for (int i = valuesToArray.length - 1; i >= 0; i--) {
		  
		  builder = builder.append(valuesToArray[i]).append(" ");
		  
		  }
		  
		  System.out.println(builder.toString());
		 
		StringBuffer builder1 = new StringBuffer();

		for (String value : valuesToArray) {

			StringBuffer reverseString1 = new StringBuffer(value).reverse().append(" ");

			builder1 = builder1.append(reverseString1);

		}

		System.out.println(builder1.toString());

	}
}
