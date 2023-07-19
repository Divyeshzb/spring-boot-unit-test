package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Response_Response_a9462117f1_Test {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testResponseConstructorSuccess() {
        Response testResponse = new Response();
        testResponse.setStatus(200);
        testResponse.setMessage("Success");
        assertEquals(200, testResponse.getStatus());
        assertEquals("Success", testResponse.getMessage());
    }

    @Test
    public void testResponseConstructorFailure() {
        Response testResponse = new Response();
        testResponse.setStatus(400);
        testResponse.setMessage("Bad Request");
        assertEquals(400, testResponse.getStatus());
        assertEquals("Bad Request", testResponse.getMessage());
    }
}
