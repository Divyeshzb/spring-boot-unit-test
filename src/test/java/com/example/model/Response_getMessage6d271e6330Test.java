package com.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseTest {

    @Test
    public void testGetMessage() {
        Response response = new Response();
        String message = "Test message";
        response.setMessage(message);
        assertEquals(message, response.getMessage());
    }
}
