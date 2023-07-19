package com.example.service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ToDoServiceImpl_getToDoById_390971540f_Test {

    @InjectMocks
    private ToDoServiceImpl toDoService;

    @Mock
    private ToDoRepository toDoRepository;

    private ToDo toDo;

    @BeforeEach
    public void setUp() {
        toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Test ToDo");
        toDo.setCompleted(false);
    }

    @Test
    public void testGetToDoById_success() {
        Mockito.when(toDoRepository.findById(1L)).thenReturn(Optional.of(toDo));

        Optional<ToDo> result = toDoService.getToDoById(1L);

        assertTrue(result.isPresent());
        assertEquals(toDo, result.get());
    }

    @Test
    public void testGetToDoById_notFound() {
        Mockito.when(toDoRepository.findById(1L)).thenReturn(Optional.empty());

        Optional<ToDo> result = toDoService.getToDoById(1L);

        assertTrue(result.isEmpty());
    }
}
