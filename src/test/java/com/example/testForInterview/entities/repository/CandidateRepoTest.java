package com.example.testForInterview.entities.repository;

import com.example.testForInterview.entities.Candidate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class CandidateRepoTest {
    @Autowired
    private CandidateRepo candidateRepo ;
    @Test
    void itShouldSelectCandidate(){
        //given
        Candidate candidate = new Candidate(Long.valueOf(10),"bilel");
        candidateRepo.save(candidate);

        //when
        boolean x=candidateRepo.existsById(candidate.getId());
        //then
        assertThat(x).isTrue();
    }

}