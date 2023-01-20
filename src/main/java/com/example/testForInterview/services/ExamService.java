package com.example.testForInterview.services;

import com.example.testForInterview.entities.Candidate;
import com.example.testForInterview.entities.Quiz;
import com.example.testForInterview.entities.QuizTestKey;
import com.example.testForInterview.entities.QuizTestQuestion;
import com.example.testForInterview.entities.repository.CandidateRepo;
import com.example.testForInterview.entities.repository.QuizRepo;
import com.example.testForInterview.entities.repository.QuizTestQuestionRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamService {
    int trueResponses=0;
    int falseResponse=0;
    private final QuizRepo quizRepo ;
    private final QuizTestQuestionRepo quizTestQuestionRepo ;
    private final CandidateRepo candidateRepo ;

    public ExamService(QuizRepo quizRepo, QuizTestQuestionRepo quizTestQuestionRepo, CandidateRepo candidateRepo) {
        this.quizRepo = quizRepo;
        this.quizTestQuestionRepo = quizTestQuestionRepo;
        this.candidateRepo = candidateRepo;
    }

    public void submitResponseOfQuestion(Long candidateId,Long quizId,Integer responseNum){
        QuizTestKey quizTestKey = new QuizTestKey(quizId, candidateId);
        Quiz quiz = quizRepo.findById(quizId).get();
        Candidate candidate =candidateRepo.findById(candidateId).get();
        quizTestQuestionRepo.save(new QuizTestQuestion(quizTestKey,quiz,candidate,responseNum));
    }
    public double getScore(int candidateId){
        double tru;
        double fal;
        double score;
        this.quizTestQuestionRepo.findAll().forEach(a->{

            if(a.getId().getCandidateId()==candidateId){

                if(a.getResponse().equals(a.getQuiz().getResponse())){
                    trueResponses+=1;
                }
                else{
                    falseResponse+=1;
                }

            }
        });
        tru=trueResponses;
        fal=falseResponse;
        score = tru / (fal + tru);
        trueResponses=0;
        falseResponse=0;
        return score;
    }
    public Optional<Quiz> getOneQuestion(String id){
        return  quizRepo.findById(Long.valueOf(id)).map((quiz) -> {
            quiz.setResponse(0);

            return quiz;
        });
    }
}
