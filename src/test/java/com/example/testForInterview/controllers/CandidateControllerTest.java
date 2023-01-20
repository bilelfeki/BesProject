package com.example.testForInterview.controllers;

import com.example.testForInterview.entities.Candidate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc

class CandidateControllerTest {
    private MockMvc mockMvc;
    Candidate candidate= new Candidate(Long.valueOf(1),"bilel");
    @Test
    void testPost() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        String content = objectMapper.writeValueAsString(candidate);
        mockMvc.perform(MockMvcRequestBuilders.post("/sapi/v1/candidate/new").param(content,"")) ;
    }
}