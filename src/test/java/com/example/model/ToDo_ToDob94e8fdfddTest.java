package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ToDo_ToDob94e8fdfddTest {

    private ToDo toDo;

    @BeforeEach
    public void setup() {
        toDo = new ToDo();
    }

    @Test
    public void testToDoConstructor() {
        Assertions.assertNotNull(toDo);
    }

    @Test
    public void testToDoDefaultValues() {
        Assertions.assertNull(toDo.getText());
        Assertions.assertEquals(false, toDo.isCompleted());
    }
}
