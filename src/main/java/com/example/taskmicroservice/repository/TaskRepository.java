package com.example.taskmicroservice.repository;

import com.example.taskmicroservice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
