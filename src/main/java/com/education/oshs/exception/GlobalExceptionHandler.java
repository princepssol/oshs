package com.education.oshs.exception;

import com.education.oshs.api.mapper.DepartmentMapper;
import com.education.oshs.api.response.Response;
import com.education.oshs.model.Department;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleException(Exception e) {
        return new ResponseEntity<>(new Response(e.toString()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
