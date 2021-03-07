package com.example.validation.hello.domain.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class HelloForm {

    @NotBlank
    @Length(min = 4, max = 8)
    @Length(min = 5, max = 6)
    private String hoge;
}
