package com.dog.resue.controller;

import com.dog.resue.dao.DodRepository;
import com.dog.resue.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class DogController {

    @Autowired
    private DodRepository dodRepository;

    @Autowired
    private DogService dogService;

    @PostMapping(value ="/")
    public String addadog(@RequestParam("name") String name,
                          @RequestParam("rescued") @DateTimeFormat(pattern = "yyyy-MM-dd") Date rescued,
                          @RequestParam("vaccinated") Boolean vaccinated, Model model)
    {
        dogService.addADog(name, rescued, vaccinated);
        System.out.println("name = " + name + ",rescued = " + rescued + ", vaccinated = " + vaccinated);
        return "redirect:/";
    }

    }

