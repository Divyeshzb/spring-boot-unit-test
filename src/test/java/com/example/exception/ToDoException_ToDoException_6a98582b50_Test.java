package com.example.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoException_ToDoException_6a98582b50_Test {

    private String errorMessage;

    @BeforeEach
    public void setUp() {
        errorMessage = "Test error message";
    }

    @Test
    public void testToDoException_withErrorMessage() {
        ToDoException exception = new ToDoException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    public void testToDoException_withEmptyErrorMessage() {
        ToDoException exception = new ToDoException("");
        assertEquals("", exception.getMessage());
    }
}
