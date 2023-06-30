package com.example.web;

import com.example.model.ToDo;
import com.example.service.ToDoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

// Test class
public class ToDoController_getAllToDodb6a2452b4Test {

    // Injecting mock objects
    @InjectMocks
    ToDoController toDoController;

    @Mock
    ToDoService toDoService;

    // Initialization before each test
    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    // Test for the case when there are some ToDos
    @Test
    public void testGetAllToDoSuccess() {
        // Creating test ToDos
        ToDo toDo1 = new ToDo();
        toDo1.setId(1L);
        toDo1.setName("ToDo 1");

        ToDo toDo2 = new ToDo();
        toDo2.setId(2L);
        toDo2.setName("ToDo 2");

        // Defining the behavior of the mock object
        when(toDoService.getAllToDo()).thenReturn(Arrays.asList(toDo1, toDo2));

        // Executing the method to test
        ResponseEntity<List<ToDo>> response = toDoController.getAllToDo();

        // Verifying the results
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
        assertEquals(toDo1, response.getBody().get(0));
        assertEquals(toDo2, response.getBody().get(1));
    }

    // Test for the case when there are no ToDos
    @Test
    public void testGetAllToDoEmpty() {
        // Defining the behavior of the mock object
        when(toDoService.getAllToDo()).thenReturn(Arrays.asList());

        // Executing the method to test
        ResponseEntity<List<ToDo>> response = toDoController.getAllToDo();

        // Verifying the results
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(0, response.getBody().size());
    }
}
