package restapi.programs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics1 {
public static void main(String[] args) {
	
	
	// post method
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body(Payloads.postPayload())
	.when().post("maps/api/place/add/json")
	.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
	
	JsonPath json=new JsonPath(response);
	String placeId=json.getString("place_id");
	System.out.println(placeId);
	String address="200 winter walk, USA";
	//put method
	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+placeId+"\",\r\n"
			+ "\"address\":\""+address+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}\r\n"
			+ "")
	.when().put("maps/api/place/update/json")
	.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	//get method
	
	response=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	.when().get("/maps/api/place/get/json")
	.then().log().all().assertThat().statusCode(200).body("address", equalTo(address)).extract().response().asString();
	
		JsonPath jsonpath=new JsonPath(response);
		address=jsonpath.getString("address");
	
}
}
