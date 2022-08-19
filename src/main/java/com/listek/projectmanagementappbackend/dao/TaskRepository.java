package com.listek.projectmanagementappbackend.dao;

import com.listek.projectmanagementappbackend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
