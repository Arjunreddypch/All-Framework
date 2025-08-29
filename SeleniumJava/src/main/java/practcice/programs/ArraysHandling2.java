package practcice.programs;

public class ArraysHandling2 {
	int id;
	String name;

	public ArraysHandling2(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public static void printingArraysWithNullValues() {
		// User defined array printing array with null values
		ArraysHandling a[] = new ArraysHandling[5];

		a[0] = new ArraysHandling(123, "Arjun");
		a[3] = new ArraysHandling(456, "Reddy");

		for (Object aa : a) {
			if (aa instanceof ArraysHandling) {

				ArraysHandling a1 = (ArraysHandling) aa;
				System.out.println(a1.id + "----" + a1.name);
			}
			if (aa == null) {

				System.out.println(aa);
			}
		}

		// printing null value index

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

				System.out.println("null value index is " + i);
			}
		}
	}

	public static void main(String[] args) {

		int[] intArray = { 50, 20, 30, 500, 40, 50, 30,5, 200, 35 };

		int sumOfAllElements = 0;

		for (int i = 0; i < intArray.length; i++) {

			sumOfAllElements = sumOfAllElements + intArray[i];

		}
		boolean value=false;
		// compare each value with other values and if it is lessthan all value assign
		// it to smallestValue;
		int minimumValue=intArray[0];
		int biggestValue=intArray[0];
		for(int i=1;i<intArray.length;i++) {
			
			if(minimumValue<intArray[i]) {
			}
			else {
				minimumValue=intArray[i];
			}
			if(biggestValue>intArray[i]) {
				
			}
			else
				biggestValue=intArray[i];
		}
		
		

		System.out.println(sumOfAllElements);
		System.out.println(minimumValue);
		System.out.println(biggestValue);

	}

}
