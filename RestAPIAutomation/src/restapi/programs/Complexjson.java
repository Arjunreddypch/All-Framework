package restapi.programs;

import io.restassured.path.json.JsonPath;

public class Complexjson {
	
	public static void main(String[] args) {
		
		
		String file=Payloads.coursePrice();
		
		JsonPath json=new JsonPath(file);
		
		int size=json.getInt("courses.size()");
		int total = 0;
		for(int i=0;i<size;i++) {
			
			int coursesPrice=json.getInt("courses["+i+"].price");
			int coursesCopies=json.getInt("courses["+i+"].copies");
			total=total+(coursesCopies*coursesPrice);
		}
		
		int purchaseAmount=json.getInt("dashboard.purchaseAmount");
		System.out.println(total+" is total amount from courses and "+purchaseAmount+" is amount from purchase Amount table") ;
		System.out.println(total==purchaseAmount);
		
		
	}

}
