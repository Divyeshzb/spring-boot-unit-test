package com.example.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoException_ToDoException94d2102c18Test {

    @Test
    public void testToDoExceptionDefaultConstructor() {
        ToDoException exception = new ToDoException();
        assertNotNull(exception);
    }

    @Test
    public void testToDoExceptionMessage() {
        String expectedMessage = "This is a test message";
        ToDoException exception = new ToDoException(expectedMessage);
        assertEquals(expectedMessage, exception.getMessage());
    }
}
