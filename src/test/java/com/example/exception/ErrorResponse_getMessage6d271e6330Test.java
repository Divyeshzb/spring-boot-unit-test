package com.example.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorResponse_getMessage6d271e6330Test {

    private ErrorResponse errorResponse;

    @BeforeEach
    public void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    public void testGetMessage_Success() {
        String expectedMessage = "Success";
        errorResponse.setMessage(expectedMessage);
        String actualMessage = errorResponse.getMessage();
        assertEquals(expectedMessage, actualMessage, "Returned message should match the expected message");
    }

    @Test
    public void testGetMessage_Null() {
        String expectedMessage = null;
        errorResponse.setMessage(expectedMessage);
        String actualMessage = errorResponse.getMessage();
        assertEquals(expectedMessage, actualMessage, "Returned message should be null when set to null");
    }
}
