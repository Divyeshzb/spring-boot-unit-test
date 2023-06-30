// Test generated by RoostGPT for test dm-example-4 using AI Model gpt

package com.example.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoException_ToDoException4517433a5eTest {

    @Test
    public void testToDoExceptionSuccess() {
        String errorMessage = "This is a test error message";
        ToDoException exception = new ToDoException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    public void testToDoExceptionFailure() {
        String errorMessage = "This is a test error message";
        ToDoException exception = new ToDoException(errorMessage);
        String wrongErrorMessage = "This is a wrong error message";
        assertEquals(wrongErrorMessage, exception.getMessage());
    }
}
