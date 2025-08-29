package practcice.programs;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {1,2,3,5,6};
		int length=arr.length;
		int number=5;
		int i=length/2;
		
			for(;i<length;i++) {
				
				
				if(arr[i]==number) {
					
					System.out.println(i);
					break;
				}
				
				else if(arr[length/2]>number) {
					
					length=(length/2)-1;
				}
				else if(arr[length/2]<number){
					length=(length/2)+1;
				}
				
			}
		
	}

}
