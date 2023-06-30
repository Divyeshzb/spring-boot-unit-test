// Test generated by RoostGPT for test dm-example-4 using AI Model gpt

package com.example.web;

import com.example.exception.ToDoException;
import com.example.model.ToDo;
import com.example.service.ToDoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ToDoController_updateToDo6a092650f3Test {

    @InjectMocks
    ToDoController toDoController;

    @Mock
    ToDoService toDoService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateToDoSuccess() throws ToDoException {
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setName("Test ToDo");
        when(toDoService.getToDoById(1L)).thenReturn(Optional.of(toDo));
        when(toDoService.saveToDo(toDo)).thenReturn(toDo);

        ResponseEntity<ToDo> response = toDoController.updateToDo(toDo);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(toDo, response.getBody());
    }

    @Test
    public void testUpdateToDoFailure() {
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setName("Test ToDo");
        when(toDoService.getToDoById(1L)).thenReturn(Optional.empty());

        assertThrows(ToDoException.class, () -> {
            toDoController.updateToDo(toDo);
        });
    }
}
