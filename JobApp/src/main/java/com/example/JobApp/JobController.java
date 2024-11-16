package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("viewalljobs")
    public String allJobs(){
        return "viewalljobs";
    }
    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }

}
