package com.listek.projectmanagementappbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private boolean code;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private Set<User> users;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private Set<Task> tasks;
}
