package com.example.testForInterview.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class QuizTestKey implements Serializable {
    @Column(name="quiz_id")
    Long QuizId;
    @Column(name="candidate_id")
    Long CandidateId ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuizTestKey)) return false;
        QuizTestKey that = (QuizTestKey) o;
        return Objects.equals(QuizId, that.QuizId) && Objects.equals(CandidateId, that.CandidateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(QuizId, CandidateId);
    }
}
