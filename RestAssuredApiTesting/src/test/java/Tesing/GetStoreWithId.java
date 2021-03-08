package Tesing;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import PostBody.APIServiceConstant;
import io.restassured.RestAssured;

public class GetStoreWithId 
{
	public static void main(String[] args) throws IOException 
	{
		RestAssured.baseURI= CallingUrl.url();
		String storeResponse=given().log().all().
				queryParam("orderId",1).
			when().
				get(APIServiceConstant.getIdResource).
			then().
				assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(storeResponse);
	}
}