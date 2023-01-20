package com.example.testForInterview.controllers;

import com.example.testForInterview.entities.Candidate;
import com.example.testForInterview.services.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="*")
@RequestMapping("/api/v1/candidate")
@RestController
public class CandidateController {

    private CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("new")
    public void createCandidate(@RequestBody Candidate candidate){
        this.candidateService.createCandidate(candidate);
    }

    @GetMapping("all")
    public List<Candidate> getAllCandidate(){
        return  this.candidateService.getAllCandidate();
    }

    @GetMapping("{name}")
    public String getCandidate(@PathVariable String name){
        return this.candidateService.getCandidateByName(name);
    }


}
