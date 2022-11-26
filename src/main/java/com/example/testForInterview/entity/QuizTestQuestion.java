package com.example.testForInterview.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class QuizTestQuestion {
    @EmbeddedId
    QuizTestKey id;

    @ManyToOne
    @MapsId("QuizId")
    @JoinColumn(name="quiz_id")
    Quiz quiz ;

    @ManyToOne
    @MapsId("CandidateId")
    @JoinColumn(name="candidate_id")
    Candidate candidate;

}
