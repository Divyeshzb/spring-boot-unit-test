package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_setCompleted152bcbf5fcTest {

    private ToDo toDo;

    @BeforeEach
    public void setup() {
        toDo = new ToDo();
    }

    @Test
    public void testSetCompletedTrue() {
        toDo.setCompleted(true);
        assertEquals(true, toDo.isCompleted(), "Expected true but was " + toDo.isCompleted());
    }

    @Test
    public void testSetCompletedFalse() {
        toDo.setCompleted(false);
        assertEquals(false, toDo.isCompleted(), "Expected false but was " + toDo.isCompleted());
    }
}
