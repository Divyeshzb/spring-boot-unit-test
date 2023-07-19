package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Response_getStatus_a7bf40aa6e_Test {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testGetStatus_success() {
        int expectedStatus = 200;
        response.setStatus(expectedStatus);
        assertEquals(expectedStatus, response.getStatus());
    }

    @Test
    public void testGetStatus_failure() {
        int expectedStatus = 404;
        response.setStatus(expectedStatus);
        assertEquals(expectedStatus, response.getStatus());
    }
}
