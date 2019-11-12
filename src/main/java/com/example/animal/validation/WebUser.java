package com.example.animal.validation;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class WebUser {

    @NotBlank(message = "username cannot be empty.")
    private String name;
    @NotBlank(message = "password cannot be empty.")
    @Length(min=6, max=10,message = "Length of password should between 6 to 10 characters.")
    private String password;
    @Min(value = 0)
    @Max(value = 100)
    private Double grade;
    @Email()
    private String email;

    public WebUser(String name, String password, Double grade, String email) {
        this.name = name;
        this.password = password;
        this.grade = grade;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Double getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }
}
