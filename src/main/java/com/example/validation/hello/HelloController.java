package com.example.validation.hello;

import com.example.validation.hello.domain.model.HelloForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello(@ModelAttribute HelloForm form, Model model) {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@ModelAttribute @Validated HelloForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return getHello(form, model);
        }

        model.addAttribute("sample", form.getHoge());
        return "helloResponse";
    }

}
