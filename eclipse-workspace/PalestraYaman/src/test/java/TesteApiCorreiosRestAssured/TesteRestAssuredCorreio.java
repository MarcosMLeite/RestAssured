

package TesteApiCorreiosRestAssured;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.response.Response;


public class TesteRestAssuredCorreio {
	@Test
	public void validarCidade() {

		Response response = 

		given()

	    .when()
	      .get("https://api.postmon.com.br/v1/cep/06020010")

		.then()
		
		  .log().all()
		  .statusCode(200)
		  .extract().response();
		   Assert.assertEquals("Vila Yara", response.path("bairro"));
}
	

		@Test	
		public void Cadastro() {		
					
		Response response =	
			given()
		    .contentType("application/json").body("{\"email\": \"marcos.leite21@gmail.com\",\"appDescription\":\"gustavo2703\"}")
			
			
			.when()
			.post("https://api.thecatapi.com/v1/user/passwordlesssignup")
			
			.then()
			.log().all()
		     .statusCode(200)
			  .extract().response();
			   Assert.assertEquals("SUCCESS", response.path("message"))
			   ;
		}
}