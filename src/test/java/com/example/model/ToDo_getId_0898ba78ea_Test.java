package com.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDo_getId_0898ba78ea_Test {

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
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetIdUninitialized() {
        long expectedId = 0L;
        long actualId = toDo.getId();
        Assertions.assertEquals(expectedId, actualId);
    }
}
