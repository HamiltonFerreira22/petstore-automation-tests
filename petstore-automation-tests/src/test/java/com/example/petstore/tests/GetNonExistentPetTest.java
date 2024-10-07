package com.example.petstore.tests;

import com.example.petstore.utils.ApiConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetNonExistentPetTest {

    @BeforeAll
    public static void setup() {
        ApiConfig.setup();
    }

    @Test
    public void pesquisarPetInexistente() {
        long petIdInexistente = 999999;

        given()
        .when()
            .get("/pet/" + petIdInexistente)
        .then()
            .statusCode(404)
            .body("message", equalTo("Pet not found"));
    }
}
