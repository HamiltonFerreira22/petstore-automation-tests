package com.example.petstore.utils;

import io.restassured.RestAssured;

public class ApiConfig {
    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
