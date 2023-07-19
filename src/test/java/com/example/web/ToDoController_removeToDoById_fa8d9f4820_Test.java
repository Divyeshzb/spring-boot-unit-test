package com.example.web;

import com.example.exception.ToDoException;
import com.example.model.Response;
import com.example.model.ToDo;
import com.example.service.ToDoService;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ToDoController_removeToDoById_fa8d9f4820_Test {

    @InjectMocks
    private ToDoController toDoController;

    @Mock
    private ToDoService toDoService;

    private ToDo testToDo;

    @BeforeEach
    public void setUp() {
        testToDo = new ToDo();
        testToDo.setId(1L);
        testToDo.setName("Test ToDo");
    }

    @Test
    public void testRemoveToDoById_success() throws ToDoException {
        when(toDoService.getToDoById(1L)).thenReturn(Optional.of(testToDo));

        ResponseEntity<Response> responseEntity = toDoController.removeToDoById(1L);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("ToDo has been deleted", responseEntity.getBody().getMessage());

        verify(toDoService, times(1)).getToDoById(1L);
        verify(toDoService, times(1)).removeToDo(testToDo);
    }

    @Test
    public void testRemoveToDoById_notFound() {
        when(toDoService.getToDoById(1L)).thenReturn(Optional.empty());

        try {
            toDoController.removeToDoById(1L);
        } catch (ToDoException e) {
            assertEquals("ToDo to delete doesn´t exist", e.getMessage());
        }

        verify(toDoService, times(1)).getToDoById(1L);
        verify(toDoService, times(0)).removeToDo(testToDo);
    }
}
