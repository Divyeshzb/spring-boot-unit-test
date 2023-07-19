package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_setId_eff136c81b_Test {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testSetId_PositiveValue() {
        long expectedId = 1;
        toDo.setId(expectedId);
        assertEquals(expectedId, toDo.getId());
    }

    @Test
    public void testSetId_NegativeValue() {
        long expectedId = -1;
        toDo.setId(expectedId);
        assertEquals(expectedId, toDo.getId());
    }
}
