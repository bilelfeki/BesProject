package com.example.testForInterview.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "candidate_id", nullable = false)
    private Long id;
    private String name ;

    public Candidate(String name) {
        this.name = name;
    }

    public Candidate(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
