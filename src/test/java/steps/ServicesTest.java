package steps;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesTest {
	
	
	//http://demoqa.com/utilities/weazmazonther/customers/register
	//Method   GET or POST
		//Request 
	//Getting the response from services 
	//

	@Test
		public void GetWeatherDetails()
			{   
		
	///  	create request and pass end point ulr and body and headers
		
				// Specify the base URL to the RESTful web service
				RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
	
				RequestSpecification httpRequest = RestAssured.given();
				httpRequest.headers("Content type","application json");
				httpRequest.body("Name","vinod");
		
				// Make a request to the server by specifying the method Type and the method URL.
				// This will return the Response from the server. Store the response in a variable.
				Response response = httpRequest.request(Method.POST, "/register");
		
				// Now let us print the body of the message to see what response
				// we have recieved from the server
				String responseBody = response.getBody().asString();
			System.out.println("Response Body is =>  " + responseBody);
		
			}
		
		}

	
	
	
	public static void main() {
		
		
	}

}
