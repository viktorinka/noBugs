package org.example.task2;


import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class ApiRequests {

    @Test
    public void addUnicorn() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
       given()
                .body("{\n" +
                        "  \"name\": \"goldy\",\n" +
                        "  \"tail_color\": \"pink\"\n" +
                        "}")
                .contentType("application/json")
                .post("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"));
    }

    @Test
    public void deleteUnicorn() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        String id = given()
                .body("{\n" +
                        "  \"name\": \"goldy\",\n" +
                        "  \"tail_color\": \"pink\"\n" +
                        "}")
                .contentType("application/json")
                .post("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract().path("_id");

        given().delete("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(200);

        given()
                .get("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(404);
    }

    @Test
    public void updateUnicorn() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        String id = given()
                .body("{\n" +
                        "  \"name\": \"rose\",\n" +
                        "  \"tail_color\": \"pink\"\n" +
                        "}")
                .contentType("application/json")
                .post("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract().path("_id");

        given()
                .body("{\n" +
                        "  \"name\": \"rose\",\n" +
                        "  \"tail_color\": \"pink\"\n" +
                        "}")
                .contentType("application/json")
                .put("https://crudcrud.com/api/5b9bab371ccc4ea2ae23b89d91337d6f/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(200);
    }

}
