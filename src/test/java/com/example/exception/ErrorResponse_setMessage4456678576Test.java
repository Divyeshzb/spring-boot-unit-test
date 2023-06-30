// Test generated by RoostGPT for test dm-example-4 using AI Model gpt

package com.example.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorResponse_setMessage4456678576Test {

    @InjectMocks
    ErrorResponse errorResponse;

    @BeforeEach
    public void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    public void testSetMessageSuccess() {
        String expectedMessage = "This is a success message";
        errorResponse.setMessage(expectedMessage);
        assertEquals(expectedMessage, errorResponse.getMessage());
    }

    @Test
    public void testSetMessageNull() {
        String expectedMessage = null;
        errorResponse.setMessage(expectedMessage);
        assertEquals(expectedMessage, errorResponse.getMessage());
    }

    @Test
    public void testSetMessageEmpty() {
        String expectedMessage = "";
        errorResponse.setMessage(expectedMessage);
        assertEquals(expectedMessage, errorResponse.getMessage());
    }
}