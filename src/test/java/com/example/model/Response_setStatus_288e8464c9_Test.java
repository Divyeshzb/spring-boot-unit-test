package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Response_setStatus_288e8464c9_Test {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testSetStatus_success() {
        int status = 200;
        response.setStatus(status);
        assertEquals(status, response.getStatus());
    }

    @Test
    public void testSetStatus_failure() {
        int status = 404;
        response.setStatus(status);
        assertEquals(status, response.getStatus());
    }
}
