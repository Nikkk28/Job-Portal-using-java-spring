package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class JobPost {
    int postID;
    String postProfile;
    String postDesc;
    int reqExperience;
    List<String> postTechStack;

}
