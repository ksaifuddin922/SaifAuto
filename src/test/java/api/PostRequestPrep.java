package api;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestPrep {
	public void prepRequest() {
		System.out.println("*************");
		String baseUri=RestAssured.baseURI="https://reqres.in";
		String basePath="/api/users/2";
	System.out.println("in");
				RequestSpecification request =RestAssured.given();
				System.out.println("in req");
				Response response=request.get(basePath);
				System.out.println("*****"+baseUri+basePath);
				int statusCode=response.getStatusCode();
				System.out.println("++++++"+statusCode);
				System.out.println(response.asPrettyString());
				
	}
//	public static void main(String[] args) {
//		PostRequestPrep ob1=new PostRequestPrep();
//		ob1.prepRequest();
	}

