package javaprograms;

public class FindSecondLargestNumberinArray {
	
	public static void main(String[] args) {
		
		int arr[]= {88,34,45,99,122,333,44,33,188,444};
		
		
		int temp=arr[0];
		int secondHihest=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			
			if(temp>arr[i+1]) {
			}
			else {
				temp=arr[i+1];
			}
		
		}
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(secondHihest<arr[i+1] && secondHihest<temp && arr[i+1]<temp) {
				secondHihest=arr[i+1];
			}
			
			
			
			
		}
		System.out.println(temp);
		System.out.println("second highest number is "+secondHihest);
		


		
	}

}
