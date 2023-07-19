package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Response_setMessage_41fefe61bb_Test {

    private Response response;

    @BeforeEach
    public void setUp() {
        response = new Response();
    }

    @Test
    public void testSetMessage_success() {
        String expectedMessage = "Success";
        response.setMessage(expectedMessage);
        assertEquals(expectedMessage, response.getMessage());
    }

    @Test
    public void testSetMessage_emptyString() {
        String expectedMessage = "";
        response.setMessage(expectedMessage);
        assertEquals(expectedMessage, response.getMessage());
    }
}
