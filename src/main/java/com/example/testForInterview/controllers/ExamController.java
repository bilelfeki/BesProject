package com.example.testForInterview.controllers;
import com.example.testForInterview.entities.Quiz;
import com.example.testForInterview.services.ExamService;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin(origins ="*")
@RestController
public class ExamController {
     private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping("/api/v1/Exam/question/{id}")
    public Optional<Quiz> getOneQuestion(@PathVariable String id){
        return  examService.getOneQuestion(id);
    }

    @PostMapping(value = "/api/v1/Exam/submit/{quizId}/{candidateId}/{responseNum}",consumes = "application/json")
    public String submitResponseOfQuestion( @PathVariable Long candidateId, @PathVariable Long quizId, @PathVariable Integer responseNum){
        examService.submitResponseOfQuestion(candidateId,quizId,responseNum);
        return "ok";
    }

    @GetMapping("api/v1/Exam/score/{candidateId}")
    public double getScore(@PathVariable int candidateId){
    return examService.getScore(candidateId);
    }
}