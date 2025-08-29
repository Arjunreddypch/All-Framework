package restapi.programs;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static String getString(String response,String key) {
		
		
			JsonPath json=new JsonPath(response);
			
			return json.getString(key);
	}

}
