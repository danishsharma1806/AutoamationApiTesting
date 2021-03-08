package Tesing;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import io.restassured.RestAssured;

public class GetStoreWithId 
{
	public static void main(String[] args) throws IOException 
	{
		String url=CallingUrl.url();
		String baseUrl=url;
		RestAssured.baseURI= baseUrl;
		String storeResponse=given().log().all().
				queryParam("orderId",1).
			when().
				get("store/order/1").
			then().
				assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(storeResponse);
	}
}