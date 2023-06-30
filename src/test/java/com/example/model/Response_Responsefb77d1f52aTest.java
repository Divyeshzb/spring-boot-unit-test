package com.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Response_Responsefb77d1f52aTest {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testResponseConstructorWithSuccessStatus() {
        int status = 200;
        String message = "Success";
        response.setStatus(status);
        response.setMessage(message);
        assertEquals(status, response.getStatus());
        assertEquals(message, response.getMessage());
    }

    @Test
    public void testResponseConstructorWithFailureStatus() {
        int status = 500;
        String message = "Internal Server Error";
        response.setStatus(status);
        response.setMessage(message);
        assertEquals(status, response.getStatus());
        assertEquals(message, response.getMessage());
    }
}
