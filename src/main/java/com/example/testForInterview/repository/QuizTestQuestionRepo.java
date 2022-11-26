package com.example.testForInterview.repository;

import com.example.testForInterview.entity.QuizTestKey;
import com.example.testForInterview.entity.QuizTestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizTestQuestionRepo extends JpaRepository<QuizTestQuestion, QuizTestKey> {
}
