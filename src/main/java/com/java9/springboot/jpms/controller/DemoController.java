package com.java9.springboot.jpms.controller;

import com.resume.model.ResumeHeaderInfo;
import com.resume.service.ResumeHeaderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DemoController {

    ResumeHeaderService resumeHeaderService = ResumeHeaderService.build();

    @GetMapping("/test")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/")
    public ResumeHeaderInfo getResumeHeader(){
        return resumeHeaderService.getResumeHeaderInfo();
    }
}
