package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_setCompleted_05576b40c2_Test {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testSetCompletedTrue() {
        toDo.setCompleted(true);
        assertEquals(true, toDo.isCompleted());
    }

    @Test
    public void testSetCompletedFalse() {
        toDo.setCompleted(false);
        assertEquals(false, toDo.isCompleted());
    }
}
