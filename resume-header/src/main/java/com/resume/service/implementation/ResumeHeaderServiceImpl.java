package com.resume.service.implementation;

import com.resume.model.ResumeHeaderInfo;
import com.resume.service.ResumeHeaderService;
import org.springframework.stereotype.Service;

@Service
public class ResumeHeaderServiceImpl implements ResumeHeaderService {

    ResumeHeaderService resumeHeaderService = () -> new ResumeHeaderInfo();

    @Override
    public ResumeHeaderInfo getResumeHeaderInfo() {
        return resumeHeaderService.getResumeHeaderInfo();
    }
}
