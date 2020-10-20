package com.resume.model;

public class ResumeHeaderInfo {

    private String name;
    private String email;

    public ResumeHeaderInfo(){
        this.name = "Aviral";
        this.email= "trivedi.aviral24@gmail.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
