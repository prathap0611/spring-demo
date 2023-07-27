package com.example.demo.rest;

import com.example.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    private Coach coach;
    @Value("${coach.name}")
    private String coachName;

    public myRestController(@Qualifier("aquatic") Coach coach) {
        this.coach = coach;
    }



    @GetMapping("/test")
    public String sayHello() {
        return "Hello " + coachName + "new!";
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
