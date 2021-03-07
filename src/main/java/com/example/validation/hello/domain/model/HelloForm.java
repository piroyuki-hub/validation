package com.example.validation.hello.domain.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class HelloForm {

    @NotNull
    @Length(min=4, max=8)
    private String hoge;
}
