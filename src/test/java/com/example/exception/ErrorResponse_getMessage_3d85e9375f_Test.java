// Test generated by RoostGPT for test dmtest using AI Type Open AI and AI Model gpt-4-0314

package com.example.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorResponse_getMessage_3d85e9375f_Test {

    @Test
    public void testGetMessage_success() {
        ErrorResponse errorResponse = new ErrorResponse("Success message");
        String expectedMessage = "Success message";
        assertEquals(expectedMessage, errorResponse.getMessage());
    }

    @Test
    public void testGetMessage_empty() {
        ErrorResponse errorResponse = new ErrorResponse("");
        String expectedMessage = "";
        assertEquals(expectedMessage, errorResponse.getMessage());
    }
}

class ErrorResponse {
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}