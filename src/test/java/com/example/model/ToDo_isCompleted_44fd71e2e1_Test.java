package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_isCompleted_44fd71e2e1_Test {

    private ToDo todo;

    @BeforeEach
    public void setUp() {
        todo = new ToDo();
    }

    @Test
    public void testIsCompletedTrue() {
        todo.setCompleted(true);
        boolean expected = true;
        boolean actual = todo.isCompleted();
        assertEquals(expected, actual);
    }

    @Test
    public void testIsCompletedFalse() {
        todo.setCompleted(false);
        boolean expected = false;
        boolean actual = todo.isCompleted();
        assertEquals(expected, actual);
    }
}
