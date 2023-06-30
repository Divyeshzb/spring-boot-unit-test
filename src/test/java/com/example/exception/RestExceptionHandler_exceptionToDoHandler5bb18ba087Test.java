package com.example.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestExceptionHandler_exceptionToDoHandler5bb18ba087Test {

    @InjectMocks
    RestExceptionHandler restExceptionHandler;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testExceptionToDoHandler_withValidException() {
        Exception ex = new Exception("Test Exception");
        ResponseEntity<ErrorResponse> responseEntity = restExceptionHandler.exceptionToDoHandler(ex);

        assertEquals(HttpStatus.NOT_FOUND.value(), responseEntity.getBody().getErrorCode());
        assertEquals("Test Exception", responseEntity.getBody().getMessage());
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }

    @Test
    public void testExceptionToDoHandler_withNullMessageException() {
        Exception ex = new Exception();
        ResponseEntity<ErrorResponse> responseEntity = restExceptionHandler.exceptionToDoHandler(ex);

        assertEquals(HttpStatus.NOT_FOUND.value(), responseEntity.getBody().getErrorCode());
        assertEquals(null, responseEntity.getBody().getMessage());
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }
}
