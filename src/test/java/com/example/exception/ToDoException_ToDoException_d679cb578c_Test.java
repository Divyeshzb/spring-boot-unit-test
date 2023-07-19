package com.example.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoException_ToDoException_d679cb578c_Test {

    @Test
    public void testToDoExceptionEmptyConstructor() {
        ToDoException exception = new ToDoException();
        assertNull(exception.getMessage());
    }

    @Test
    public void testToDoExceptionWithMessage() {
        String message = "Test message";
        ToDoException exception = new ToDoException(message);
        assertEquals(message, exception.getMessage());
    }
}
