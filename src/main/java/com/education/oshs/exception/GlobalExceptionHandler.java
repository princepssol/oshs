package com.education.oshs.exception;

import com.education.oshs.api.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleException(Exception e) {
        return new ResponseEntity<>(new Response(String.join(": ", e.getClass().getSimpleName(), e.getMessage())), INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProjectException.class)
    public ResponseEntity<Response> handleProjectException(ProjectException e) {
        return new ResponseEntity<>(new Response(e.getMessage()), BAD_REQUEST);
    }
}
