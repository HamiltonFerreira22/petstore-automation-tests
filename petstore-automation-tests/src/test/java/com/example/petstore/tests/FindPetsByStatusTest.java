package com.example.petstore.tests;

import com.example.petstore.utils.ApiConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class FindPetsByStatusTest {

    @BeforeAll
    public static void setup() {
        ApiConfig.setup();
    }

    @Test
    public void pesquisarPetsComStatusPending() {
        String status = "pending";

        given()
            .queryParam("status", status)
        .when()
            .get("/pet/findByStatus")
        .then()
            .statusCode(200)
            .body("size()", greaterThanOrEqualTo(0))
            .body("status", everyItem(equalTo("pending")));
    }
}
