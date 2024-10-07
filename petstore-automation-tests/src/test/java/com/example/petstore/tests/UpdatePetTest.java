package com.example.petstore.tests;

import com.example.petstore.models.Pet;
import com.example.petstore.utils.ApiConfig;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UpdatePetTest {

    @BeforeAll
    public static void setup() {
        ApiConfig.setup();
    }

    @Test
    public void atualizarDadosPetExistente() {
        Pet pet = new Pet();
        pet.setId(2002);
        pet.setName("Rex Atualizado");
        pet.setStatus("available");

        given()
            .contentType(ContentType.JSON)
            .body(pet)
        .when()
            .put("/pet")
        .then()
            .statusCode(200)
            .body("id", equalTo(2002))
            .body("name", equalTo("Rex Atualizado"))
            .body("status", equalTo("available"));
    }
}
