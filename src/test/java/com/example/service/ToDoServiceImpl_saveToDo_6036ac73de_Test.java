package com.example.service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ToDoServiceImpl_saveToDo_6036ac73de_Test {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveToDo_success() {
        ToDo todo = new ToDo();
        todo.setTitle("Test ToDo");
        todo.setDescription("This is a test ToDo");

        ToDo savedTodo = new ToDo();
        savedTodo.setId(1L);
        savedTodo.setTitle("Test ToDo");
        savedTodo.setDescription("This is a test ToDo");

        when(toDoRepository.save(todo)).thenReturn(savedTodo);

        ToDo result = toDoService.saveToDo(todo);

        assertNotNull(result);
        assertEquals(savedTodo.getId(), result.getId());
        assertEquals(savedTodo.getTitle(), result.getTitle());
        assertEquals(savedTodo.getDescription(), result.getDescription());

        verify(toDoRepository, times(1)).save(todo);
    }

    @Test
    public void testSaveToDo_failure() {
        ToDo todo = new ToDo();
        todo.setTitle("Test ToDo");
        todo.setDescription("This is a test ToDo");

        when(toDoRepository.save(todo)).thenReturn(null);

        ToDo result = toDoService.saveToDo(todo);

        assertNull(result);
        verify(toDoRepository, times(1)).save(todo);
    }
}
