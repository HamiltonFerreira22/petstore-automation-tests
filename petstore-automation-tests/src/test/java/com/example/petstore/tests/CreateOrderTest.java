package com.example.petstore.tests;

import com.example.petstore.models.Order;
import com.example.petstore.utils.ApiConfig;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CreateOrderTest {

    @BeforeAll
    public static void setup() {
        ApiConfig.setup();
    }

    @Test
    public void cadastrarNovoPedidoComSucesso() {
        Order order = new Order();
        order.setId(1001);
        order.setPetId(2002);
        order.setQuantity(3);
        order.setShipDate("2024-10-10T10:00:00.000Z");
        order.setStatus("placed");
        order.setComplete(true);

        given()
            .contentType(ContentType.JSON)
            .body(order)
        .when()
            .post("/store/order")
        .then()
            .statusCode(200)
            .body("id", equalTo(1001))
            .body("petId", equalTo(2002))
            .body("quantity", equalTo(3))
            .body("status", equalTo("placed"))
            .body("complete", equalTo(true));
    }
}
