package restapi.programs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

public class JIRABugCreation {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://apiautomationtestpractice.atlassian.net";

		String authorizationKeyValue = "Basic cmF2aWNoYW5kcmlrYTQ4MEBnbWFpbC5jb206QVRBVFQzeEZmR0YwbTBXeHJOUnZ4ZnBZbDlnYnp1TDM5bGxIWkJmZV9ZUEtwMHN3VFloOWhHSWlRQjlhd0lXOC1fM0NSTlhRT1ZjMHVDSkxrTVFPYkdaR3pSN1BzcGhsWjJoTzhhRGM2ejRuMEZJTkQ4U2ZVRFE2b2pCNVJRamg3dkE3XzNwWU1qdnBFWHBGYmNBd1ZzcFN2dGtCZkdYcVA3cHdrQkhaVVNBdVdOa1FrU0pmTkd3PTIwM0M5Rjkx";

		String response = given().log().all().header("Content-Type", "application/json")
				.header("Authorization", authorizationKeyValue)
				.body("{\r\n" + "  \"fields\": {\r\n" + "    \"project\": {\r\n" + "      \"key\": \"SCRUM\"\r\n"
						+ "    },\r\n" + "    \"summary\": \"Elements not loading in the page1\",\r\n"
						+ "    \"issuetype\": {\r\n" + "      \"name\": \"Bug\"\r\n" + "    }\r\n" + "  }\r\n" + "}")
				.when().post("rest/api/3/issue").then().log().all().assertThat().statusCode(201).extract().response()
				.asString();

		JsonPath js = new JsonPath(response);
		String bugID = js.get("id");

		// Attachments

		given().log().all().
		header("X-Atlassian-Token", "no-check").
		header("Authorization", authorizationKeyValue).
		multiPart("file", new File("C:\\Users\\dines\\Desktop\\TestData.xlsx")).when().
		post("rest/api/3/issue/" + bugID + "/attachments").then().log().all().assertThat().statusCode(200);
	}

}
