package com.example.testForInterview.repository;
import com.example.testForInterview.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long> {

}
