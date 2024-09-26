// Test generated by RoostGPT for test dm-example-4 using AI Model gpt

package com.example.service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ToDoServiceImpl_getAllToDo351c64a6baTest {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllToDo_Success() {
        ToDo todo1 = new ToDo("ToDo 1");
        ToDo todo2 = new ToDo("ToDo 2");

        when(toDoRepository.findAll()).thenReturn(Arrays.asList(todo1, todo2));

        List<ToDo> result = toDoService.getAllToDo();

        assertEquals(2, result.size());
        assertEquals("ToDo 1", result.get(0).getTitle());
        assertEquals("ToDo 2", result.get(1).getTitle());
    }

    @Test
    public void testGetAllToDo_EmptyList() {
        when(toDoRepository.findAll()).thenReturn(Arrays.asList());

        List<ToDo> result = toDoService.getAllToDo();

        assertEquals(0, result.size());
    }
}
