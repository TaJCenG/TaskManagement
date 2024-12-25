package com.repo.TaskManagementWithAI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.TaskManagementWithAI.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

