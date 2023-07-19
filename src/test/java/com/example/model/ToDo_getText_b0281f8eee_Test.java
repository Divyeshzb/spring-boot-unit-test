package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_getText_b0281f8eee_Test {

    private ToDo todo;

    @BeforeEach
    public void setUp() {
        todo = new ToDo();
    }

    @Test
    public void testGetTextWhenTextIsSet() {
        String expectedText = "Sample text";
        todo.setText(expectedText);
        assertEquals(expectedText, todo.getText());
    }

    @Test
    public void testGetTextWhenTextIsNull() {
        todo.setText(null);
        assertEquals(null, todo.getText());
    }
}
