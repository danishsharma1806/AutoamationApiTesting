package Tesing;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import PostBody.APIServiceConstant;
import PostBody.UserBodyPut;
import io.restassured.RestAssured;

public class Put_Pet 
{
	public static void main(String[] args) throws IOException 
	{
		RestAssured.baseURI= CallingUrl.url();
		String reponse= given().log().all().
			header("Content-Type","application/json").
			body(UserBodyPut.putBody()).
		when().
			put(APIServiceConstant.putResource).
		then().
			assertThat().log().all().statusCode(200).extract().response().toString();
		System.out.println(reponse);
		
		System.out.println( "------------------------------------------------------------------------");
		
		String storeResponse1=given().log().all().
			when().
				get(APIServiceConstant.getUserResource).
			then().
				assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(storeResponse1);
	}
}