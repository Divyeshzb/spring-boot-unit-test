package com.example.web;

import com.example.exception.ToDoException;
import com.example.model.ToDo;
import com.example.service.ToDoService;
import com.example.util.PayloadValidator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ToDoController_saveToDo81c68cf835Test {

    @InjectMocks
    ToDoController toDoController;

    @Mock
    ToDoService toDoService;

    @Mock
    PayloadValidator payloadValidator;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveToDo_Success() throws ToDoException {
        ToDo payload = new ToDo();
        // TODO: Set the required fields of the ToDo object
        when(payloadValidator.validateCreatePayload(payload)).thenReturn(true);
        when(toDoService.saveToDo(payload)).thenReturn(payload);
        ResponseEntity<ToDo> responseEntity = toDoController.saveToDo(payload);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(payload, responseEntity.getBody());
    }

    @Test(expected = ToDoException.class)
    public void testSaveToDo_Failure() throws ToDoException {
        ToDo payload = new ToDo();
        // TODO: Set the required fields of the ToDo object
        when(payloadValidator.validateCreatePayload(payload)).thenReturn(false);
        toDoController.saveToDo(payload);
    }
}
