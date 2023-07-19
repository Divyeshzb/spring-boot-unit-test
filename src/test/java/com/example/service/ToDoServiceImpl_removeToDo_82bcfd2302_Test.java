package com.example.service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class ToDoServiceImpl_removeToDo_82bcfd2302_Test {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRemoveToDo_success() {
        ToDo todo = new ToDo();
        todo.setId(1L);
        todo.setTitle("Test ToDo");

        toDoService.removeToDo(todo);

        verify(toDoRepository, times(1)).delete(todo);
    }

    @Test
    public void testRemoveToDo_null() {
        ToDo todo = null;

        toDoService.removeToDo(todo);

        verify(toDoRepository, times(0)).delete(any(ToDo.class));
    }
}
