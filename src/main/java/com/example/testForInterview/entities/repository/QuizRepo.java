package com.example.testForInterview.entities.repository;
import com.example.testForInterview.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long> {

}
