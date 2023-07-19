// Test generated by RoostGPT for test dmtest using AI Type Open AI and AI Model gpt-4-0314

package com.example.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorResponse_getErrorCode_092bf4e430_Test {

    @Test
    public void testGetErrorCode_success() {
        ErrorResponse errorResponse = new ErrorResponse(404, "Not Found");
        int expectedErrorCode = 404;
        int actualErrorCode = errorResponse.getErrorCode();
        assertEquals(expectedErrorCode, actualErrorCode);
    }

    @Test
    public void testGetErrorCode_zero() {
        ErrorResponse errorResponse = new ErrorResponse(0, "No Error");
        int expectedErrorCode = 0;
        int actualErrorCode = errorResponse.getErrorCode();
        assertEquals(expectedErrorCode, actualErrorCode);
    }
}