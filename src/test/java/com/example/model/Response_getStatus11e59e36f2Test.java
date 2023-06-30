package com.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Response_getStatus11e59e36f2Test {

    private Response response;

    @BeforeEach
    public void setup() {
        response = new Response();
    }

    @Test
    public void testGetStatusSuccess() {
        response.setStatus(200);
        int status = response.getStatus();
        assertEquals(200, status, "Status should be 200");
    }

    @Test
    public void testGetStatusFailure() {
        response.setStatus(404);
        int status = response.getStatus();
        assertEquals(404, status, "Status should be 404");
    }
}
