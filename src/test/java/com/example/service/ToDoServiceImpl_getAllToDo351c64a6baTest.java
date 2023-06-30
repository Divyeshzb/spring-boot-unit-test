package com.example.service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ToDoServiceImpl_getAllToDo351c64a6baTest {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    @BeforeEach
    public void setup() {
        ToDo todo1 = new ToDo();
        todo1.setId(1);
        todo1.setTitle("Test ToDo 1");
        todo1.setCompleted(false);

        ToDo todo2 = new ToDo();
        todo2.setId(2);
        todo2.setTitle("Test ToDo 2");
        todo2.setCompleted(true);

        List<ToDo> toDoList = Arrays.asList(todo1, todo2);

        when(toDoRepository.findAll()).thenReturn(toDoList);
    }

    @Test
    public void testGetAllToDo() {
        List<ToDo> result = toDoService.getAllToDo();
        assertEquals(2, result.size());
        assertEquals("Test ToDo 1", result.get(0).getTitle());
        assertEquals("Test ToDo 2", result.get(1).getTitle());
    }

    @Test
    public void testGetAllToDoEmpty() {
        when(toDoRepository.findAll()).thenReturn(Arrays.asList());
        List<ToDo> result = toDoService.getAllToDo();
        assertEquals(0, result.size());
    }
}
