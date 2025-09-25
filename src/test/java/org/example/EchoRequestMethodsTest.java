package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class EchoRequestMethodsTest {

    private final String BASE = "https://postman-echo.com";

    @Test
    public void testGetRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get(BASE + "/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRequest() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"Alex\",\"role\":\"QA\"}")
                .when()
                .post(BASE + "/post")
                .then()
                .statusCode(200)
                .body("data.name", equalTo("Alex"))
                .body("data.role", equalTo("QA"));
    }

    @Test
    public void testPutRequest() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"update\":\"true\"}")
                .when()
                .put(BASE + "/put")
                .then()
                .statusCode(200)
                .body("data.update", equalTo("true"));
    }

    @Test
    public void testPatchRequest() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"patch\":\"yes\"}")
                .when()
                .patch(BASE + "/patch")
                .then()
                .statusCode(200)
                .body("data.patch", equalTo("yes"));
    }

    @Test
    public void testDeleteRequest() {
        when()
                .delete(BASE + "/delete")
                .then()
                .statusCode(200)
                .body("url", containsString("/delete"));
    }
}
