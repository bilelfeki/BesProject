package com.example.testForInterview.entities.repository;

import com.example.testForInterview.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepo extends JpaRepository<Candidate, Long> {
    List<Candidate> findCandidateByName(String name);
}
