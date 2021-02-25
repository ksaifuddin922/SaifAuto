package apistepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoFeatureStepDef {
	@Given("Run my sample cucumber test")
	public void run_my_sample_cucumber_test() {
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

	@Then("can run the sample test")
	public void can_run_the_sample_test() {
		System.out.println("****************Then run the sample test************* ");

	}

}
