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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ToDoController_getToDoById_798df786fc_Test {

    @InjectMocks
    private ToDoController toDoController;

    @Mock
    private ToDoService toDoService;

    private ToDo testToDo;

    @BeforeEach
    public void setUp() {
        testToDo = new ToDo();
        testToDo.setId(1L);
        testToDo.setTask("Test Task");
    }

    @Test
    public void testGetToDoById_success() throws ToDoException {
        Mockito.when(toDoService.getToDoById(1L)).thenReturn(Optional.of(testToDo));

        ResponseEntity<ToDo> response = toDoController.getToDoById(1L);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(testToDo, response.getBody());
    }

    @Test
    public void testGetToDoById_notFound() {
        Mockito.when(toDoService.getToDoById(2L)).thenReturn(Optional.empty());

        assertThrows(ToDoException.class, () -> toDoController.getToDoById(2L));
    }
}
