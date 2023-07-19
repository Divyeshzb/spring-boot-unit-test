package com.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDo_setText_ac4dfcd71e_Test {

    private ToDo todo;

    @BeforeEach
    public void setUp() {
        todo = new ToDo();
    }

    @Test
    public void testSetText_ValidText() {
        String validText = "This is a valid text";
        todo.setText(validText);
        assertEquals(validText, todo.getText(), "The text should be set correctly");
    }

    @Test
    public void testSetText_EmptyText() {
        String emptyText = "";
        todo.setText(emptyText);
        assertEquals(emptyText, todo.getText(), "The text should be set as an empty string");
    }
}
