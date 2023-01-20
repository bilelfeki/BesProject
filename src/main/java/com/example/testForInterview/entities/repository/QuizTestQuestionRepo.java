package com.example.testForInterview.entities.repository;

import com.example.testForInterview.entities.QuizTestKey;
import com.example.testForInterview.entities.QuizTestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizTestQuestionRepo extends JpaRepository<QuizTestQuestion, QuizTestKey> {

}