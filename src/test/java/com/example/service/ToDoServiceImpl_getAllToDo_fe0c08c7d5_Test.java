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
public class ToDoServiceImpl_getAllToDo_fe0c08c7d5_Test {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    private ToDo task1;
    private ToDo task2;
    private List<ToDo> tasks;

    @BeforeEach
    void setUp() {
        task1 = new ToDo();
        task1.setName("Task 1");
        task2 = new ToDo();
        task2.setName("Task 2");
        tasks = Arrays.asList(task1, task2);
    }

    @Test
    public void testGetAllToDo_Success() {
        when(toDoRepository.findAll()).thenReturn(tasks);

        List<ToDo> result = toDoService.getAllToDo();

        assertEquals(tasks, result, "Expected and actual ToDo lists should match");
    }

    @Test
    public void testGetAllToDo_EmptyList() {
        when(toDoRepository.findAll()).thenReturn(Arrays.asList());

        List<ToDo> result = toDoService.getAllToDo();

        assertEquals(0, result.size(), "Expected empty ToDo list");
    }
}
