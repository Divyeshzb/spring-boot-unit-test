package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_ToDo_2586105b41_Test {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testConstructorText() {
        assertEquals("", toDo.getText(), "Text should be empty by default");
    }

    @Test
    public void testConstructorCompleted() {
        assertEquals(false, toDo.isCompleted(), "Completed status should be false by default");
    }
}
