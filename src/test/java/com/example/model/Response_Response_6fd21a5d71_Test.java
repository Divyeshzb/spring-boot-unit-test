package com.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Response_Response_6fd21a5d71_Test {

    @Test
    public void testResponseConstructor() {
        Response response = new Response();
        assertNotNull(response);
    }

    @Test
    public void testResponseConstructorWithSuper() {
        Response response = new Response() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        assertNotNull(response);
    }
}
