package com.example.web;

import com.example.exception.ToDoException;
import com.example.model.Response;
import com.example.model.ToDo;
import com.example.service.ToDoService;
import com.example.util.PayloadValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ToDoController_updateToDo_2846d25275_Test {

    @InjectMocks
    private ToDoController toDoController;

    @Mock
    private ToDoService toDoService;

    private ToDo testToDo;

    @BeforeEach
    public void setUp() {
        testToDo = new ToDo();
        testToDo.setId(1L);
        testToDo.setDescription("Test ToDo");
    }

    @Test
    public void testUpdateToDo_success() throws ToDoException {
        when(toDoService.getToDoById(testToDo.getId())).thenReturn(Optional.of(testToDo));
        when(toDoService.saveToDo(testToDo)).thenReturn(testToDo);

        ResponseEntity<ToDo> response = toDoController.updateToDo(testToDo);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(testToDo, response.getBody());
    }

    @Test
    public void testUpdateToDo_notFound() {
        when(toDoService.getToDoById(testToDo.getId())).thenReturn(Optional.empty());

        try {
            toDoController.updateToDo(testToDo);
        } catch (ToDoException e) {
            assertEquals("ToDo to update doesn´t exist", e.getMessage());
        }
    }
}
