package com.example.util;

import com.example.model.ToDo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayloadValidator_validateCreatePayload_2cc54f88de_Test {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testValidateCreatePayload_success() {
        ToDo toDo = new ToDo();
        toDo.setId(-1);
        assertTrue(PayloadValidator.validateCreatePayload(toDo), "Expected validation to succeed with id less than or equal to 0");
    }

    @Test
    public void testValidateCreatePayload_failure() {
        ToDo toDo = new ToDo();
        toDo.setId(1);
        assertFalse(PayloadValidator.validateCreatePayload(toDo), "Expected validation to fail with id greater than 0");
    }
}
