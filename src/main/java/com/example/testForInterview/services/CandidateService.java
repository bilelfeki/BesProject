package com.example.testForInterview.services;

import com.example.testForInterview.entities.Candidate;
import com.example.testForInterview.entities.repository.CandidateRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private CandidateRepo candidateRepo ;

    public CandidateService(CandidateRepo candidateRepo) {
        this.candidateRepo = candidateRepo;
    }
    public void  createCandidate(Candidate candidate){
        if(candidateRepo.findCandidateByName(candidate.getName()).size()<=0){
            candidateRepo.save(candidate) ;
        }
    }
    public List<Candidate> getAllCandidate(){
        return  this.candidateRepo.findAll();
    }

    public String getCandidateByName(String name) {
        List<Candidate> candidates =this.candidateRepo.findCandidateByName(name) ;
        if(candidates.size()>=1){
            return String.valueOf(candidates.get((0)).getId());
        }
        else{
            return "not exist";
        }
    }
/*    public void deleteCandidate(Long id){
        this.candidateRepo.delete(Long.valueOf(id));
    }*/
}
