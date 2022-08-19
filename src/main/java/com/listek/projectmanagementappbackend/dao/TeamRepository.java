package com.listek.projectmanagementappbackend.dao;

import com.listek.projectmanagementappbackend.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
