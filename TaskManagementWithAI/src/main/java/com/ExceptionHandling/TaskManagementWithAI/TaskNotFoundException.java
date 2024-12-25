package com.ExceptionHandling.TaskManagementWithAI;


public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
