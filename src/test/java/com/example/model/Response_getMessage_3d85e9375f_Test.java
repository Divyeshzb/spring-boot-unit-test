package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Response_getMessage_3d85e9375f_Test {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testGetMessage_success() {
        String expectedMessage = "Hello, World!";
        response.setMessage(expectedMessage);
        String actualMessage = response.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMessage_empty() {
        String expectedMessage = "";
        response.setMessage(expectedMessage);
        String actualMessage = response.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
