package com.repo.TaskManagementWithAI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.TaskManagementWithAI.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUser_UserIdAndIsReadFalse(Long userId);
}
