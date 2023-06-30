// Test generated by RoostGPT for test dm-example-4 using AI Model gpt

package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_setId76a1f2b39aTest {

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
    }

    @Test
    public void testSetId_PositiveNumber() {
        long expectedId = 123L;
        toDo.setId(expectedId);
        assertEquals(expectedId, toDo.getId(), "The id should be set correctly for positive numbers");
    }

    @Test
    public void testSetId_NegativeNumber() {
        long expectedId = -123L;
        toDo.setId(expectedId);
        assertEquals(expectedId, toDo.getId(), "The id should be set correctly for negative numbers");
    }
}
