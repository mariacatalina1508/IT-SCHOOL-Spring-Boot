package com.itschool.project.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.project.exceptions.practice.UserCreateException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);
    private  final ObjectMapper objectMapper;

    public ExceptionHandlerAdvice(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }
    @ExceptionHandler(UserCreateException.class)
    public ResponseEntity<String>userCreateException(UserCreateException userCreateException){
        return  new ResponseEntity<>(objectToString(Map.of("message",userCreateException.getMessage())) , BAD_REQUEST);
    }

    private String objectToString(Object response) {
        try{
            return  objectMapper.writeValueAsString(response);
        }catch (JsonProcessingException e){
            log.error("Error processing response to string");
        }return  "Internal error";
    }
}