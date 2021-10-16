package com.education.oshs.exception;

public class ProjectException extends RuntimeException {
    public static String NO_CHILDREN = "There is no children in department with id = %d";
    public static String NOT_EXISTS = "There is no entity with id = %d";
    public static String NO_PARENT = "There is no parent in department with id = %d";

    public ProjectException(){

    }

    public ProjectException(String message) {
        super(message);
    }
}
