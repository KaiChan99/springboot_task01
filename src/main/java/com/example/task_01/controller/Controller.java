package com.example.task_01.controller;

import com.example.task_01.models.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Controller {

//    @GetMapping("/greeting")
//    public String greet(@RequestParam(value = "name") String name){
//        return "Good afternoon!, " +name;
//    }

   


    @GetMapping
    public Greet newGreet(@RequestParam(value = "timeOfDay") String timeOfDay){
    Greet greet = new Greet();
    return new Greet("Kai", timeOfDay);

    }


}