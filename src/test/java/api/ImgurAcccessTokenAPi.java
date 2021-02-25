package api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ImgurAcccessTokenAPi {

	public void generateAccessTokenForImgurapi() {
		
		RestAssured.baseURI="https://api.imgur.com/";
		 RequestSpecification request=RestAssured.given();
		 request.get("oauth2/token");
		 request.formParam("refresh_token", "");
		 request.formParam("client_id", "");
		 request.pathParam("", " ");
		 
		 
	}
}
