package com.resume.service;

import com.resume.model.ResumeHeaderInfo;
import com.resume.service.implementation.ResumeHeaderServiceImpl;
import org.springframework.stereotype.Service;

@Service
public interface ResumeHeaderService {

    ResumeHeaderInfo getResumeHeaderInfo();

    public static ResumeHeaderService build(){
        return new ResumeHeaderServiceImpl();
    }

}
