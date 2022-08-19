package com.listek.projectmanagementappbackend.dao;

import com.listek.projectmanagementappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
