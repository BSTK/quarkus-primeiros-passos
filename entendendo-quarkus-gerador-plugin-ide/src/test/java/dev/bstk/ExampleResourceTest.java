package dev.bstk;

import io.quarkus.test.junit.QuarkusTest;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
            .when().get("/hello")
            .then()
            .statusCode(200)
            .body(is("Hello RESTEasy"));
    }

    @Test
    void deveRetornarUmaListaDeTecnolgias() {
        given()
            .when().get("/hello/tecnologiasTextPlain")
            .then()
            .statusCode(HttpStatus.SC_OK)
            .body(is("[Java, .NET, NodeJs, AWS, Azure]"));
    }

}
