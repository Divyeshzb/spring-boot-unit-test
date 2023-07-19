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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ToDoController_saveToDo_498fe0ba2e_Test {

    @InjectMocks
    private ToDoController toDoController;

    @Mock
    private ToDoService toDoService;

    private ToDo testToDo;

    @BeforeEach
    public void setUp() {
        testToDo = new ToDo();
        testToDo.setTitle("Test ToDo");
        testToDo.setDescription("This is a test ToDo");
    }

    @Test
    public void testSaveToDo_Success() throws ToDoException {
        ToDo savedToDo = new ToDo();
        savedToDo.setId(1L);
        savedToDo.setTitle(testToDo.getTitle());
        savedToDo.setDescription(testToDo.getDescription());

        when(toDoService.saveToDo(testToDo)).thenReturn(savedToDo);

        ResponseEntity<ToDo> response = toDoController.saveToDo(testToDo);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(savedToDo, response.getBody());
    }

    @Test
    public void testSaveToDo_Failure() {
        testToDo.setId(1L);

        ToDoException exception = null;
        try {
            toDoController.saveToDo(testToDo);
        } catch (ToDoException e) {
            exception = e;
        }

        assertEquals("Payload malformed, id must not be defined", exception.getMessage());
    }
}
