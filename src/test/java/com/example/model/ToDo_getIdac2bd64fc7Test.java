package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_getIdac2bd64fc7Test {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testGetIdSuccess() {
        long expectedId = 1L;
        toDo.setId(expectedId);
        long actualId = toDo.getId();
        assertEquals(expectedId, actualId, "The expected ID did not match the actual ID");
    }

    @Test
    public void testGetIdFailure() {
        long unexpectedId = 2L;
        toDo.setId(1L);
        long actualId = toDo.getId();
        assertNotEquals(unexpectedId, actualId, "The unexpected ID should not match the actual ID");
    }
}
