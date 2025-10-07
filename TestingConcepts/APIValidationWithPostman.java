package TestingConcepts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIValidationWithPostman {
    public static void main(String[] args) {

        // Base URI
        RestAssured.baseURI = "https://jsonplace
