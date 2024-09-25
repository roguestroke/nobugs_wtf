package com.example.teamcity.api;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class BuildConfigurationTest extends BaseApiTest{

    @Test
    public void buildConfigurationTest() {
        var token = RestAssured.get("http://admin:admin@192.168.0.103:8111/authenticationTest.html?csrf")
                .then().assertThat().statusCode(HttpStatus.SC_OK).
                extract().asString();

        System.out.println(token);
    }
}
