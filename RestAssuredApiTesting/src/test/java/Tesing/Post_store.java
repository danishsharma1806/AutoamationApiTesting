package Tesing;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import PostBody.StoreBodyPost;
import io.restassured.RestAssured;

public class Post_store 
{
	public static void main(String[] args) throws IOException 
	{
		String url=CallingUrl.url();
		String baseUrl=url;
		RestAssured.baseURI= baseUrl;
		String response=given().log().all().
				header("Content-Type","application/json").
				body(StoreBodyPost.body()).
				when().
				post("store/order").
				then().
				assertThat().statusCode(200).
				extract().response().asString();
		System.out.println(response);
	}
}