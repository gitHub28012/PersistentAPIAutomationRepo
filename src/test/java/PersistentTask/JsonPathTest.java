package PersistentTask;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilityMethods.RetryAnalyzer;

import java.util.HashSet;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class JsonPathTest extends RetryAnalyzer {

    @BeforeClass
    public  void method1(){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        RestAssured.config = RestAssuredConfig.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam("http.connection.timeout", 5000)   // connection timeout
                        .setParam("http.socket.timeout", 5000)       // socket timeout
                        .setParam("http.connection-manager.timeout", 5000)); // request timeout

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testGetEndpoint() {
        Response response =
                given()
                        .when()
                        .get("/posts") // replace with actual endpoint
                        .then().log().all()
                        .extract().response();

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch");

        //record size
        int size = response.jsonPath().getList("").size();
        Assert.assertEquals(size,100);

        // unique id
        List<Integer> ids=response.jsonPath().getList("id");
        HashSet<Integer> uniqueIds = new HashSet<>(ids);
        Assert.assertEquals(ids.size(), uniqueIds.size(), "Duplicate IDs found!");

     //   Assert.assertTrue(response.getBody().asString().contains("expectedValue"), "Response body validation failed");
    }

    @Test
    public void verifyInvalidEndpoint() {
        Response response = given().contentType("application/json").
                when().get("/invalid").
                then().log().all().extract().response();

        // Assertion
        Assert.assertEquals(response.getStatusCode(),404,"Not found enter validate end point");
    }


}
