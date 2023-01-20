package com.example.testForInterview.services;

import com.example.testForInterview.entities.Quiz;
import com.example.testForInterview.entities.repository.QuizRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private QuizRepo quizRepo ;

    public QuizService(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }
    public List<Quiz> getAllQuiz(){
        return this.quizRepo.findAll() ;
    }
}
