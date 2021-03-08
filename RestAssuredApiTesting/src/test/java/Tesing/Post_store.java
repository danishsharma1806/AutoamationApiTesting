package Tesing;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import PostBody.StoreBodyPost;
import io.restassured.RestAssured;

public class Post_store 
{
	public static void main(String[] args) throws IOException 
	{
		Properties property=new Properties();
		FileInputStream fs=new FileInputStream("F:\\OCA\\RestAssuredApiTesting\\src\\test\\resources\\Links.properties");
		property.load(fs);
		String baseUrl=property.getProperty("url");
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