package com.kmj.springwebapp.controllers;

import com.kmj.springwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value = "/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
