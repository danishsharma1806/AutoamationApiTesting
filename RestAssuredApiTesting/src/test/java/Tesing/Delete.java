package Tesing;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import PostBody.APIServiceConstant;
import io.restassured.RestAssured;

public class Delete 
{
	public static void main(String[] args) throws IOException 
	{
		RestAssured.baseURI= CallingUrl.url();
		String response=given().log().all().
			when().
				delete(APIServiceConstant.getIdResource).
			then().
				assertThat().statusCode(200).
				extract().response().asString();
		System.out.println(response);
		System.out.println( "------------------------------------------------------------------------------");
		String storeResponse1=given().log().all().
				queryParam("orderId",1).
			when().
				get(APIServiceConstant.getIdResource).
			then().
				assertThat().log().all().statusCode(404).extract().response().asString();
		System.out.println(storeResponse1);
	}
}