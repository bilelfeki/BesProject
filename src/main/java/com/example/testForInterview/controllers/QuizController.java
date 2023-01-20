package com.example.testForInterview.controllers;

import com.example.testForInterview.entities.Quiz;
import com.example.testForInterview.services.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {
    public QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/api/v1/quiz/al            l")
    public List<Quiz> getAllQuiz(){
        return this.quizService.getAllQuiz();
    }
}

