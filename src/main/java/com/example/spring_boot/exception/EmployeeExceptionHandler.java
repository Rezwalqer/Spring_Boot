//package com.example.spring_boot.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class EmployeeExceptionHandler {
//
//    @ExceptionHandler
//    public ResponseEntity<MessageForException> handleException(
//            EmployeeException employeeException) {
//        MessageForException message = new MessageForException();
//        message.setMessage(employeeException.getMessage());
//
//        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
//    }
//
//}