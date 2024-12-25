package com.repo.TaskManagementWithAI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.TaskManagementWithAI.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedTo_UserId(Long userId);
    List<Task> findByStatus(String status);
}
