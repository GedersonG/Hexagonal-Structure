package com.example.Hexastructure.infrastructure.exceptionHandler;

import com.example.Hexastructure.infrastructure.exception.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {
    public static final String MESSAGE = "menssage";

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Map<String,String>> handleNoDataFoundException(
            NoDataFoundException ignoreNoDataFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.NO_DATA_FOUND.getMessage()));
    }
}