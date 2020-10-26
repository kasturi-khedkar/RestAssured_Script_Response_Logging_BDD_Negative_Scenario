package StepDefinitions;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseLogging {

	Response response;
	@Test
	@Given("API for foreign Exchange")
	public void api_for_foreign_Exchange() {
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@Test
	@When("posted with correct Information")
	public void posted_with_correct_Information() {
		response=RestAssured.given().get("/api/");
		int code=response.getStatusCode();
		Assert.assertTrue(code!=200);
	}

	@Test
	@Then("validate postive response code received")
	public void validate_postive_response_code_received() {
		int code=response.getStatusCode();
		Assert.assertTrue(code!=200);

		RestAssured.given().headers("content-Type","appication/json").get("/api/").
		then().assertThat().statusCode(400).log().all();
	}
	
}
