package com.example.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoException_getErrorMessage_c0ba7b8126_Test {

    private ToDoException toDoException;

    @BeforeEach
    public void setUp() {
        toDoException = new ToDoException();
    }

    @Test
    public void testGetErrorMessage_Success() {
        String expectedErrorMessage = "Task not found";
        toDoException.setErrorMessage(expectedErrorMessage);
        String actualErrorMessage = toDoException.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testGetErrorMessage_EmptyString() {
        String expectedErrorMessage = "";
        toDoException.setErrorMessage(expectedErrorMessage);
        String actualErrorMessage = toDoException.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
