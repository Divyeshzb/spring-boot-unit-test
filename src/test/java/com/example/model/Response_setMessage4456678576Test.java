package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Response_setMessage4456678576Test {
    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testSetMessage_Success() {
        String expectedMessage = "Hello, Test!";
        response.setMessage(expectedMessage);
        assertEquals(expectedMessage, response.getMessage());
    }

    @Test
    public void testSetMessage_Null() {
        String expectedMessage = null;
        response.setMessage(expectedMessage);
        assertEquals(expectedMessage, response.getMessage());
    }
}
