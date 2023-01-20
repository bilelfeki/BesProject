package com.example.testForInterview.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quiz_id", nullable = false)
    private Long id;
    private String Question ;
    private String firstChoice ;
    private String secondChoice ;
    private String thirdChoice ;
    private Integer response ;
}
