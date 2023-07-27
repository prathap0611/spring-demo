package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("Football coach");
    }
    @Override
    public String getDailyWorkout() {
        return "Run 10k!";
    }
}
