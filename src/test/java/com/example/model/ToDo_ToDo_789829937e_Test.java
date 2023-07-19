package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ToDoTest {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testId() {
        assertNull(toDo.getId());
        toDo.setId(1L);
        assertEquals(1L, toDo.getId());
    }

    @Test
    public void testTitle() {
        assertNull(toDo.getTitle());
        toDo.setTitle("Test Title");
        assertEquals("Test Title", toDo.getTitle());
    }

    @Test
    public void testDescription() {
        assertNull(toDo.getDescription());
        toDo.setDescription("Test Description");
        assertEquals("Test Description", toDo.getDescription());
    }
}
