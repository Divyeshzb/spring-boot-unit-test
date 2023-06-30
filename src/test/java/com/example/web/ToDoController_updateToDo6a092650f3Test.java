package com.example.web;

import com.example.exception.ToDoException;
import com.example.model.ToDo;
import com.example.service.ToDoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ToDoController_updateToDo6a092650f3Test {

    @InjectMocks
    ToDoController toDoController;

    @Mock
    ToDoService toDoService;

    @Test
    public void testUpdateToDo_Success() throws ToDoException {
        ToDo toDo = new ToDo();
        toDo.setId(1);
        when(toDoService.getToDoById(1)).thenReturn(Optional.of(toDo));
        when(toDoService.saveToDo(toDo)).thenReturn(toDo);

        ResponseEntity<ToDo> response = toDoController.updateToDo(toDo);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(toDo, response.getBody());
    }

    @Test(expected = ToDoException.class)
    public void testUpdateToDo_Failure() {
        ToDo toDo = new ToDo();
        toDo.setId(1);
        when(toDoService.getToDoById(1)).thenReturn(Optional.empty());

        toDoController.updateToDo(toDo);
    }
}
