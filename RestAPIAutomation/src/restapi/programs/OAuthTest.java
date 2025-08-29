package restapi.programs;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import restapi.programs.pojoclasses.API;
import restapi.programs.pojoclasses.GetCourse;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OAuthTest {

	
	public static void main(String[] args) {
		
		
		String response =given().formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.formParams("grant_type", "client_credentials")
				.formParams("scope", "trust").log().all()
		.when().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").
		then().log().all().assertThat().extract().response().asString();
		
		JsonPath jsonResponse=new JsonPath(response);
		
		String access_token=jsonResponse.getString("access_token");
		
		GetCourse getCourse=given().queryParam("access_token", access_token).log().all().
		when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").
		then().log().all().extract().as(GetCourse.class);
		
		System.out.println(getCourse.getLinkedIn());
		System.out.println(getCourse.getExpertise());
			
	getCourse.getCourses().getApi().stream().filter(s->s.getCourseTitle().
				contains("SoapUI Webservices testing")).forEach(s->System.out.println(s.getPrice()));
		getCourse.getCourses().getWebAutomation().stream().forEach(t->System.out.println(t.getCourseTitle()));
	
	}
}
