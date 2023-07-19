package com.example.web;

import com.example.model.ToDo;
import com.example.service.ToDoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ToDoController.class)
public class ToDoController_getAllToDo_31823dd588_Test {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ToDoService toDoService;

    private ToDoController toDoController;

    @BeforeEach
    public void setUp() {
        toDoController = new ToDoController(toDoService);
    }

    @Test
    public void testGetAllToDo_success() {
        ToDo toDo1 = new ToDo();
        ToDo toDo2 = new ToDo();
        List<ToDo> expectedToDoList = Arrays.asList(toDo1, toDo2);

        when(toDoService.getAllToDo()).thenReturn(expectedToDoList);

        ResponseEntity<List<ToDo>> responseEntity = toDoController.getAllToDo();
        List<ToDo> actualToDoList = responseEntity.getBody();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedToDoList, actualToDoList);
    }

    @Test
    public void testGetAllToDo_emptyList() {
        List<ToDo> expectedToDoList = Arrays.asList();

        when(toDoService.getAllToDo()).thenReturn(expectedToDoList);

        ResponseEntity<List<ToDo>> responseEntity = toDoController.getAllToDo();
        List<ToDo> actualToDoList = responseEntity.getBody();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedToDoList, actualToDoList);
    }
}
