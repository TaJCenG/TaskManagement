package com.service.TaskManagementWithAI;


import java.util.List;

import com.entity.TaskManagementWithAI.Task;
import com.entity.TaskManagementWithAI.TaskDTO;

public interface TaskService {
    Task createTask(TaskDTO taskDTO);
    Task updateTask(Long taskId, TaskDTO taskDTO);
    Task getTaskById(Long taskId);
    List<Task> getAllTasks();
    void deleteTask(Long taskId);
}

